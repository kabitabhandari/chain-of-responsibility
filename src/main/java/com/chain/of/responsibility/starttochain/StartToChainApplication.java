package com.chain.of.responsibility.starttochain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartToChainApplication {

	public static void main(String[] args) {
		AbstractLogger loggerChain = AbstractLogger.getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug level");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error level");
	}

}
