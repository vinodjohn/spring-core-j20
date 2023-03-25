package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Vinod John
 * @Date 25.03.2023
 */
@Component(value = "secondName")
public class SecondName implements BeanName {
    private String name;

    public SecondName() {
        this.name = "John";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
