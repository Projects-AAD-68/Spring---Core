package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        boolean isSingletonCustomer = beanFactory.isSingleton("customer");
        System.out.println("Is customer singleton: "+isSingletonCustomer);
        ctx.registerShutdownHook();
    }
}
