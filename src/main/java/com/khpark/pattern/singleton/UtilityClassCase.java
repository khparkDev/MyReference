package com.khpark.pattern.singleton;

/**
 * 아래와 같은 유틸리티성으로 만든 static 팩토리 메소드들이 모일 경우
 * 혹시라도 불필요한 객체 생성을 막기 위해 private 생성자를 명시해준다.
 *
 */
public class UtilityClassCase {
	private UtilityClassCase() {
		//nothing to do
	}

	public static void util1() {
		System.out.println("util1");
	}

	public static void util2() {
		System.out.println("util1");
	}

	public static void util3() {
		System.out.println("util1");
	}
}
