package com.chain.of.responsibility.starttochain;

public abstract class AbstractLogger {
    public static int  INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public int level;

    //set next in chain or responsibility
    public AbstractLogger next; // AbstractLogger object is next and also a instance variable
    public void setNext(AbstractLogger n){
        this.next = n;
    }

    public void logMessage(int incomingLevel, String message){
        if(this.level <= incomingLevel) {
            write(message);
        }
        if(next != null){
            next.logMessage(incomingLevel, message);
        }
    }

    abstract public void write(String message);

    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(ERROR);
        AbstractLogger debugLogger = new DebugLogger(DEBUG);
        AbstractLogger infoLogger = new InfoLogger(INFO);

        errorLogger.setNext(debugLogger);
        debugLogger.setNext(infoLogger);
        return infoLogger;
    }


}
