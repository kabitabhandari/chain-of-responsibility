package com.chain.of.responsibility.starttochain;

public class DebugLogger extends AbstractLogger {

    DebugLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("DEBUG!! " + message);
    }
}
