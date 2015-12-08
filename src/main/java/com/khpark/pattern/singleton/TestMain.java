package com.khpark.pattern.singleton;

public class TestMain {
	public static void main(String... args) {
		SingletonCase1 s1 = SingletonCase1.getInstance();
		SingletonCase2 s2 = SingletonCase2.INSTANCE;

		s1.msg("case1");
		s2.msg("case2");

		UtilityClassCase.util1();

		//		new SingletonCase1();
		//		new SingletonCase2();
		//		new UtilityClassCase();
	}
}
