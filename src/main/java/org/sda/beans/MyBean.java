package org.sda.beans;

import lombok.Data;

/**
 * @author Vinod John
 * @Date 25.03.2023
 */
@Data
public class MyBean {
    private String name;

    public String sayHello(){
        return "Hello!" + name;
    }
}
