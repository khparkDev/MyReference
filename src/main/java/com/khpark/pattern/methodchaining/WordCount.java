package com.khpark.pattern.methodchaining;

@SuppressWarnings("unused")
public class WordCount {
	private int count;
	private String str;

	public WordCount setCount(int count) {
		this.count = count;
		
		return this;
	}

	public WordCount setStr(String str) {
		this.str = str;
		
		return this;
	}
}
