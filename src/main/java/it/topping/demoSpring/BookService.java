package it.topping.demoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by seansin@cbnu.ac.kr.com on 09/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */
@Service
public class BookService {

    /**
     * 만약 BookRepository 여러개라면, 어떠한 BookRepository를 스프링이 주입할까?
     * -> 주입을 못한다 (Couldn't autowired.)
     */

    @Autowired
    BookRepository bookRepository;



}
