package com.khpark.effective.function.obj;


/**
 * 전략을 표현할 때 함수 객체를 사용하는 한 방법
 * ----------------------------------------------
 * 함수 객체는 필드를 가지지 않는 하나의 메소드만을 제공하는 stateless한 클래스를 말한다.
 * 따라서 구현 클래스의 모든 인스턴스는 기능적으로 동일.
 * 
 * 여기서는 비교대상의 객체가 여러 타입이 될 수 있으므로 제네릭으로 선언하였다.
 * (제네릭에서 사용되는 타입 파라미터 : T(Type, N(number), K(key), V(value), E(element) etc.)
 *
 */
public interface Comparator<T> {
	public int compare(T t1, T t2);
}
