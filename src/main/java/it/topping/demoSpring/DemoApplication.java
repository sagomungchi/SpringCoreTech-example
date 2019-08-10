package it.topping.demoSpring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by seansin@cbnu.ac.kr.com on 09/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */

// ApplicationContext 등록
@SpringBootApplication
@EnableAsync
public class DemoApplication {

    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class);
    }

}
