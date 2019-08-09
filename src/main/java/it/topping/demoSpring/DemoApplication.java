package it.topping.demoSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by seansin@cbnu.ac.kr.com on 09/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */
public class DemoApplication {
    public static void main(String[] args){
        // Java 설정파일 ApplicationContext 등록
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // XML 설정파일 ApplicationContext 등록
        // ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        BookService bookService = (BookService) context.getBean("bookService");
        // 의존성 주입 확인
        System.out.println(bookService.bookRepository != null);
    }
}
