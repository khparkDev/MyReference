package com.khpark.effective.function.obj;

import java.util.List;

public class ArrayListLengthCompareImpl implements Comparator<List<?>> {

	@Override
	public int compare(List<?> t1, List<?> t2) {
		return t1.size() - t2.size();
	}
}
