package it.topping.demoSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by seansin@cbnu.ac.kr.com on 09/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public  BookRepository bookRepository(){
        return new BookRepository();
    }

    @Bean
    public BookService bookService(BookRepository bookRepository){
        BookService bookService = new BookService();
        //의존성 주입
        // 1. 메소드를 활용 : bookService.setBookRepository(bookRepository());
        // 2. 메소드 인자를 활용
        bookService.setBookRepository(bookRepository);
        return bookService;
    }
}
