package it.topping.demoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by seansin@cbnu.ac.kr.com on 10/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */
@Component
public class Single {

    @Autowired
    Proto proto;

    // Thread-Safe X
    int value = 0;

    public Proto getProto() {
        return proto;
    }
}
