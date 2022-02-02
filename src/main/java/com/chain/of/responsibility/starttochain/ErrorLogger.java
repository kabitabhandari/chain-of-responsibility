package com.chain.of.responsibility.starttochain;

public class ErrorLogger extends AbstractLogger {

    ErrorLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("ERROR !! " + message);
    }
}
