package org.sda.beans;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author Vinod John
 * @Date 25.03.2023
 */
@Data
@Service("myBean")
public class MyBean {
    private String name;

    public String sayHello() {
        return "Hello! " + name;
    }
}
