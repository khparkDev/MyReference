package com.khpark.pattern.observer;

import static com.khpark.pattern.observer.TestMessage.*;

public class TestMain {
	public static void main(String[] args) {
		TmonMorningNewsSummary newsSummary = new TmonMorningNewsSummary();
		Client client1 = new Client("한국");
		Client client2 = new Client("일본");
		Client client3 = new Client("중국");

		// 옵저버에 클라이언트 등록
		newsSummary.registerObserver(client1);
		newsSummary.registerObserver(client2);
		newsSummary.registerObserver(client3);

		// 뉴스정보 업데이트
		newsSummary.setNewsSummaryText(NEWS.get(0));

		// 옵저버에서 클라이언트 제거 
		newsSummary.removeObserver(client2);
		
		System.out.println();
		
		// 뉴스정보 업데이트
		newsSummary.setNewsSummaryText(NEWS.get(1));
		
	}
}
