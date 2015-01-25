package com.jaewoo.pattern.factory;

public class FactoryPatternTest {
	public static void main(String[] args) {
		Factory factory = new CardFactory();
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("나잘난");
		card1.use();
		card2.use();
	}
}