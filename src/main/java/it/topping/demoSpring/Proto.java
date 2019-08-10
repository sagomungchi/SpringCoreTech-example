package it.topping.demoSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by seansin@cbnu.ac.kr.com on 10/08/2019
 * Blog : http://dailyworker.github.io
 * Github : http://github.com/dailyworker
 */

// 클래스 기반의 프록시로 감싸라!
@Component @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {

}
