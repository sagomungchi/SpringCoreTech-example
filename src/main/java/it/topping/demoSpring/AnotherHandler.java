package it.topping.demoSpring;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by seansin@cbnu.ac.kr.com on 10/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */

@Component
public class AnotherHandler {

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE + 2)
    public void handle(MyEvent myEvent){
        System.out.println(Thread.currentThread().toString());
        System.out.println("Another" + myEvent.getData());
    }
}
