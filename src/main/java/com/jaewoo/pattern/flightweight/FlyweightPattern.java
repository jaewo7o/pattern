package com.jaewoo.pattern.flightweight;

import com.jaewoo.pattern.flightweight.PersonFactory.Person;

public class FlyweightPattern {
	public static void main(String [] arguments) throws java.io.IOException{
		Person p1 = PersonFactory.getPerson("홍길동");
        Person p2 = PersonFactory.getPerson("김말자");
        Person p3 = PersonFactory.getPerson("홍길동");
        
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
    }
}