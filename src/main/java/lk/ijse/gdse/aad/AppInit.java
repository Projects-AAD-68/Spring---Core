package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.aop.Transaction;
import lk.ijse.gdse.aad.beans.TestBean;
import lk.ijse.gdse.aad.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        Transaction transaction = (Transaction)ctx.getBean("transaction");
        transaction.startTransaction();
        transaction.endTransaction();
//        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
//        boolean isSingletonTest = beanFactory.isSingleton("test");
//        System.out.println(test);
//        System.out.println("Is test singleton: "+isSingletonTest);
        ctx.registerShutdownHook();
    }
}
