package com.jaewoo.pattern.bridge;

public class SodaDispenser {
    private SodaFactory sodaFactory;

    public void setSodaFactory(SodaFactory sodaFactory) {
        this.sodaFactory = sodaFactory;
    }

    public Soda dispenseSoda() {
        Soda soda = sodaFactory.createSoda();
        soda.bubbling();
        return soda;
    }
}
