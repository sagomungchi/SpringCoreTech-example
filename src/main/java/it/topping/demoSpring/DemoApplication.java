package it.topping.demoSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;
import out.MyService;

import java.util.function.Supplier;

/**
 * Created by seansin@cbnu.ac.kr.com on 09/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */

// ApplicationContext 등록
@SpringBootApplication
public class DemoApplication {

    @Autowired
    MyService myService;

    public static void main(String[] args){
        var app = new SpringApplication(DemoApplication.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            if (true) {
                ctx.registerBean(MyService.class);
                ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition!"));
            }
        });
        app.run(args);

    }

}
