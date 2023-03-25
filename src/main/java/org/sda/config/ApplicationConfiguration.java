package org.sda.config;

import org.sda.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vinod John
 * @Date 25.03.2023
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public MyBean myBean(){
        MyBean  myBean = new MyBean();
        myBean.setName("Vinod");
        return myBean;
    }
}
