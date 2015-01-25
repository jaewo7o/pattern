package com.jaewoo.pattern.factory;

public class BonusCard extends Product {
	public static final String USED_MSG = "의 BonusCard를 사용합니다.";

	/**
	 * @uml.property name="owner"
	 */
	private String owner;

	public BonusCard(String owner) {
		System.out.println(owner + "의 BonusCard를 만듭니다.");
		this.owner = owner;
	}

	public void use() {
		System.out.println(owner + USED_MSG);
	}
}
