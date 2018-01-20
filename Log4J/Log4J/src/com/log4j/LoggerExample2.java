package com.log4j;

import org.apache.log4j.Logger;

public class LoggerExample2 {

	final static Logger logger = Logger.getLogger(LoggerExample2.class);

	public static void main(String[] args) {

		LoggerExample2 obj = new LoggerExample2();

		try {
			obj.divide();
		} catch (ArithmeticException ex) {
			logger.error("Sorry, something wrong!", ex);
		}

	}

	private void divide() {

		int i = 10 / 0;

	}
}
