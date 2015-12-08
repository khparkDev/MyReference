package com.khpark.pattern.singleton;

/**
 * 고전적인 방법
 *
 */
public class SingletonCase1 {
	private static final SingletonCase1 singletonCase1 = new SingletonCase1();

	private SingletonCase1() {
	}

	public static SingletonCase1 getInstance() {
		return singletonCase1;
	}
	
	public void msg(String msg) {
		System.out.println(msg);
	}
}
