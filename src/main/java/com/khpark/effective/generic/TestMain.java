package com.khpark.effective.generic;

public class TestMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TestGeneric<Integer> tg1 = new TestGeneric<Integer>(1);
		TestGeneric<String> tg2 = new TestGeneric<String>("hello, world");

		tg1.printMessage();
		tg2.printMessage();

		// 명확하게 타입 지정
		GenericStack<String> gs1 = new GenericStack<String>();
		gs1.push("string");
		System.out.println(gs1.pop());

		// 모든 타입을 사용하도록 지정
		@SuppressWarnings("rawtypes")
		GenericStack gs2 = new GenericStack();
		gs2.push("str");
		gs2.push(1);
		System.out.println(gs2.pop());
		System.out.println(gs2.pop());
		System.out.println(gs2.pop());
	}

}
