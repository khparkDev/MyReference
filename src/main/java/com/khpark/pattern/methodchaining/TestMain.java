package com.khpark.pattern.methodchaining;

public class TestMain {

	public static void main(String... args) {
		new WordCount().setCount(1).setStr("test message");
	}
}
