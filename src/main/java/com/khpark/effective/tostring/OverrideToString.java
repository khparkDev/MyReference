package com.khpark.effective.tostring;

public class OverrideToString {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Object클래스의 toString()은 클래스명@해쉬코드 값으로 노출시킨다.
	 * 따라서 항상 오버라이드해서 의미있는 값을 출력하도록 습관화 하자.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" name = " + name);
		sb.append(" age = " + age);

		return sb.toString();
	}

}
