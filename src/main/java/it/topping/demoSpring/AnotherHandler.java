package it.topping.demoSpring;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by seansin@cbnu.ac.kr.com on 10/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */

@Component
public class AnotherHandler {

    @EventListener
    @Async
    public void handle(MyEvent myEvent){
        System.out.println(Thread.currentThread().toString());
        System.out.println("Another" + myEvent.getData());
    }
}
