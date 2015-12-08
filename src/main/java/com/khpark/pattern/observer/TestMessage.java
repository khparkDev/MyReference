package com.khpark.pattern.observer;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class TestMessage {
	public static final List<String> NEWS = new ArrayList<String>() {
		{
			add("쿠팡 입맛에 맞는 사업자 밀어주기?... 동일 상품 두고 파트너들 가격경쟁 (아주경제)");
			add("위메프, 3천억 유치 추진…소셜커머스 `錢爭` (매일경제)");
			add("[김현주의 일상 톡톡] 믿을곳 없는 사회, 끊임없이 의심하며 산다 (세계일보)");
			add("롯데쇼핑 ‘납품 단가 후려치기’ 횡포…공정위 조사 (KBS)");
		}
	};
}
