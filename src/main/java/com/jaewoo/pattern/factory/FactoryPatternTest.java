package com.jaewoo.pattern.factory;

public class FactoryPatternTest {
	public static void main(String[] args) {
		Factory factory = new CardFactory();
		Product card1 = factory.create("ȫ�浿");
		Product card2 = factory.create("���߳�");
		card1.use();
		card2.use();
	}
}
