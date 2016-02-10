package com.jaewoo.pattern.bridge;

public class BridgePatternDemo {

    /* Bridge pattern : 다리 건너편의 일은 신경쓰지않는다. 단지 건너갈 뿐이다. 
     * Bridge pattern은 이처럼 다리건너편의 기능에 대한 구현을 감춰준다. 
     * 단지 다리를 통해 그 기능에 접근해 사용하기만 할 뿐이다.
      
      OOP에서 interface의 목적도 작은 Bridge pattern의 실체라 볼 수 있다. 
      interface를 구현하는 클래스는 사용하는측에게 구현내용을 공개할 의무가 없다. 
                사용하는 측도 단지 interface를 통해 그 기능에 접근할 뿐이다. 
                 
                이처럼 하나의 구현에 대해 interface로 감추고 클라이언트에 자신의 interface만 노출시켜 interface를 다리로 이용하도록 할 수도 있으며 
                이를 확장하여 Factory pattern을 사용하여 Strategy pattern을 구현한 Bridge로도 응용할 수 있다.*/
    public static void main(String[] args) {
        /* Soda가 SodaDispenser와 Coke의 Bridge가 되어준것이다. */
        SodaDispenser dispensor = new SodaDispenser();
        dispensor.setSodaFactory(new CokeFactory());
        
        dispensor.dispenseSoda();
    }
}