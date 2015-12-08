package com.khpark.effective.performance;

/**
 * 엄청나게 느린 로직
 * primitive type 을 boxed primitive 클래스 객체로 자동 변환해주는 기능을 잘못 사용한 예제, 아래 예제는 오토박싱의 잘못된 사용 예제.
 * long -> Long (오토박싱)
 * Long -> long (오토언박싱)
 */
public class Performance {
	public Long worstSum() {
		// long 의 박스형 객체라 아래 for문에서 sum을 할때 계속 객체가 생성됨.
		Long sum = 0L;

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}

		return sum;
	}

	public Long sum() {
		// 기본형 변수 타입을 사용
		long sum = 0L;

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}

		return sum;
	}

}
