package com.khpark.pattern.builder;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 빌더 패턴 이용 (파라미터가 4개이상이면 사용할 것)
 */
@SuppressWarnings("unused")
public class CompanyUser {
	private String name;
	private String phone;
	private String company;
	private int age;
	private int weight;
	private int height;

	public static class Builder {
		// 필수
		private final String name;
		private final String telephone;
		private final String company;

		// 선택
		private int age = -1;
		private int weight = -1;
		private int height = -1;

		public Builder(String name, String telephone, String company) {
			this.name = name;
			this.telephone = telephone;
			this.company = company;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder weight(int weight) {
			this.weight = weight;
			return this;
		}

		public Builder height(int height) {
			this.height = height;
			return this;
		}

		public CompanyUser build() {
			return new CompanyUser(this);
		}
	}

	private CompanyUser(Builder builder) {
		this.name = builder.name;
		this.phone = builder.telephone;
		this.company = builder.company;
		this.age = builder.age;
		this.weight = builder.weight;
		this.height = builder.height;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
