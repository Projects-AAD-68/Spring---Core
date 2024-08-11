package lk.ijse.gdse.aad.config;

import lk.ijse.gdse.aad.beans.Customer;
import lk.ijse.gdse.aad.beans.Order;
import lk.ijse.gdse.aad.beans.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {TestBean.class})
public class Config {
    @Bean
   public Order order(){
       return new Order();
   }
}
