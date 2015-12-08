package com.khpark.pattern.singleton;

/**
 * 이 방법을 강력 추천, serialized, deserialized도 문제없다.
 */
public enum SingletonCase2 {
	INSTANCE;

	public void msg(String msg) {
		System.out.println(msg);
	}
}
