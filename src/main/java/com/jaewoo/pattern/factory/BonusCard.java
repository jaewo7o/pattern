package com.jaewoo.pattern.factory;

import org.apache.log4j.Logger;

public class BonusCard extends Product {
	private Logger LOG = Logger.getLogger(BonusCard.class);
	
	public static final String USED_MSG = "의 BonusCard를 사용합니다.";

	/**
	 * @uml.property name="owner"
	 */
	private String owner;

	public BonusCard(String owner) {
		LOG.debug(owner + "의 BonusCard를 만듭니다.");
		this.owner = owner;
	}

	public void use() {
		LOG.debug(owner + USED_MSG);
	}
}
