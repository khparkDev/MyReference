package com.khpark.effective.function.obj;

public class StringLengthCompareImpl implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return str1.length() - str2.length();
	}

}
