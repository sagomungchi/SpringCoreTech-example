package it.topping.demoSpring;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by seansin@cbnu.ac.kr.com on 09/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */
// ApplicationContext 등록
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args){
        /**
         * 스프링 부트 기반에서는 @SpringBootApplication 애노테이션이 붙였을 때
         * @Configuration과 @ComponentScan의 기능이 이미 담겨있으므로 ApplicationContext를 따로 사용할 일은 드물다.
         */
    }
}
