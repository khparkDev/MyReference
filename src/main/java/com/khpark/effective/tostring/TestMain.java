package com.khpark.effective.tostring;

public class TestMain {

	public static void main(String[] args) {
		OverrideToString ts1 = new OverrideToString();
		ts1.setAge(20);
		ts1.setName("tmon");
		NonOverrideToString ts2 = new NonOverrideToString();
		ts2.setAge(20);
		ts2.setName("tmon");
		System.out.println(ts1);
		System.out.println(ts2);
	}

}
