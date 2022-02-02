package com.chain.of.responsibility.starttochain;

public class InfoLogger extends AbstractLogger{

    InfoLogger(int level){
        this.level = level;
    }


    @Override
    public void write(String message) {
        System.out.println("INFO!! " + message);
    }
}
