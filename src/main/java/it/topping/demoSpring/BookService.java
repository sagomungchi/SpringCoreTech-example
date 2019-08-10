package it.topping.demoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by seansin@cbnu.ac.kr.com on 09/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */
@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public void printBookRepository(){
        System.out.println(bookRepository.getClass());
    }
}
