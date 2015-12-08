package com.khpark.effective.generic;

/**
 * 제네릭 사용시 convention을 꼭 맞추지 않아도 된다
 * 하지만 암묵적인 약속이므로 이왕이면 convention에 맞게 작성하는 것이 좋다
 * K(key), V(value), T(type), E(element)
 * 
 * @author user
 * 
 */
public class TestGeneric<T> {
	private T t;

	public TestGeneric() {
	}

	public TestGeneric(T t) {
		this.t = t;
	}

	public void printMessage() {
		System.out.println(t);
	}
}
