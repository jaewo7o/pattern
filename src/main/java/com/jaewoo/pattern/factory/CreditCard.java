package com.jaewoo.pattern.factory;

import org.apache.log4j.Logger;

public class CreditCard extends Product {
	private Logger LOG = Logger.getLogger(CreditCard.class);
	
	public static final String USED_MSG = "의 CreditCard사용합니다.";

	/**
	 * @uml.property name="owner"
	 */
	private String owner;

	public CreditCard(String owner) {
		LOG.debug(owner + "의 CreditCard를 만듭니다.");
		this.owner = owner;
	}

	public void use() {
		LOG.debug(owner + USED_MSG);
	}
}
