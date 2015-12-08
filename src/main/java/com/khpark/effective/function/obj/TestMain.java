package com.khpark.effective.function.obj;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String... args) {
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add(new Object());
		list1.add(new Object());
		list1.add(new Object());
		list1.add(new Object());
		list2.add(new Object());

		Comparator c1 = new ArrayListLengthCompareImpl();
		Comparator c2 = new StringLengthCompareImpl();

		System.out.println("리스트 크기 비교 : " + c1.compare(list1, list2));
		System.out.println("스트링 길이 비교 : " + c2.compare("abc", "abcde"));
	}
}
