package com.jaewoo.pattern.factory;

public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		return p;
	}
	protected abstract Product createProduct(String owner);
}
