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
    BookRepository bookRepository;

    /**
     * 생성자 의존성 주입은 빈을 만들다가 다른 의존성을 못찾아서 실패
     * Setter? -> BookService 자체를 만들 수 있지 않는가?
     * -> @Autowired라는 것을 만나서 의존성 주입을 하고자해서 실패
     * -> 따라서 인터페이스만 만들고자 하는 경우는 의존성을 옵션으로 주면된다.
     *
     */
    @Autowired(required = false)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
