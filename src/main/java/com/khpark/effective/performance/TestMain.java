package com.khpark.effective.performance;

public class TestMain {

	public static void main(String[] args) {
		Performance p = new Performance();

		long start1 = System.currentTimeMillis();
		System.out.println(p.worstSum());
		long end1 = System.currentTimeMillis();

		long start2 = System.currentTimeMillis();
		System.out.println(p.sum());
		long end2 = System.currentTimeMillis();

		System.out.println("worstSum elapsed time : " + (end1 - start1) / 1000 + " s");
		System.out.println("sum elapsed time : " + (end2 - start2) / 1000 + " s");
	}

}
