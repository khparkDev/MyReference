package com.khpark.effective.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 제네릭 타입을 적용한 스택 예제
 *
 */
public class GenericStack<T> {
	private T[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public GenericStack() {
		elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(T e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}

		Object result = elements[--size];
		elements[size] = null;
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
}
