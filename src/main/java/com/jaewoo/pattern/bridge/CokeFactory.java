package com.jaewoo.pattern.bridge;

public class CokeFactory extends SodaFactory {
    public class Coke implements Soda {
        public void bubbling() {
            System.out.println("Bubbling likes volcano!");
        }
    }

    @Override
    public Soda createSoda() {
        Coke coke = new Coke();
        return coke;
    }
}
