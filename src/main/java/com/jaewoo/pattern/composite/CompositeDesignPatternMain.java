package com.jaewoo.pattern.composite;

public class CompositeDesignPatternMain {
    
    public static void main(String[] args) {
        
        Employee manager1 = new Manager("Javaking", 24000);
        Employee emp1 = new Developer("Scott", 10000);
        Employee emp2 = new Developer("Tiger", 15000);
       
        manager1.add(emp1);
        manager1.add(emp2);
       
        Manager manager2 = new Manager("JavaGod", 50000);
        Employee emp3 = new Developer("banjang", 22000);       
        manager2.add(emp3);
       
        Manager master = new Manager("Master", 1000000);
        master.add(manager1);
        master.add(manager2);
       
        master.print();
       
    }
}
