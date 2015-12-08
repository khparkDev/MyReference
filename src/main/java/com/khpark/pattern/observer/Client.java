package com.khpark.pattern.observer;

public class Client implements Observer {
	private String clientId;
	private String newsSummaryText;

	public Client(String clientId) {
		this.clientId = clientId;
	}

	@Override
	public void update(String newsSummaryText) {
		this.newsSummaryText = newsSummaryText;
		display();
	}

	public void display() {
		System.out.println("구독한 클라이언트 : " + clientId + ", 뉴스요약 : " + newsSummaryText);
	}
}
