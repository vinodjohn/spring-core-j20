package org.sda.beans;

import lombok.Data;
import org.sda.interfaces.BeanName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Vinod John
 * @Date 25.03.2023
 */

@Data
@Component
public class MyBean {
    private BeanName name;

    public MyBean(@Qualifier("firstName") BeanName name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello!" + name.getName();
    }
}
