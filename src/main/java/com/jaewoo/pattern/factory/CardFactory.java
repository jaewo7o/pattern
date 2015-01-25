package com.jaewoo.pattern.factory;

public class CardFactory extends Factory {
	protected Product createProduct(String owner) {
		//return new CreditCard(owner);
		return new BonusCard(owner);
	}
}
