package com.khpark.pattern.builder;

public class TestMain {
	public static void main(String... args) {
		CompanyUser u1 = new CompanyUser.Builder("홍길동", "010-000-0001", "tmon").build();
		CompanyUser u2 = new CompanyUser.Builder("철수", "010-000-0002", "nhn").age(28).height(180).weight(70).build();
		CompanyUser u3 = new CompanyUser.Builder("영희", "010-000-0003", "kakao").height(165).build();

		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
	}
}
