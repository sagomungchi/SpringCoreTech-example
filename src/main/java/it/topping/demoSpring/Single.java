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
    /**
     * SingleTone Scope의 빈이 ProtoType Scope의 빈을 사용할 경우
     * ProtoType의 빈을 사용하려고 프로터피를 지정할 때,
     * ProtoType의 빈은 계속 생성되기때문에 프로퍼티가 변경이 안된다.
     */
    @Autowired
    Proto proto;

    public Proto getProto() {
        return proto;
    }
}
