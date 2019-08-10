package it.topping.demoSpring;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by seansin@cbnu.ac.kr.com on 10/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */
@Component
public class MyEventHandler {

    @EventListener
    @Async
    public void handle(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받았다. 데이터는 " + event.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
    }


    @EventListener
    @Async
    public void handle(ContextClosedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
    }
}
