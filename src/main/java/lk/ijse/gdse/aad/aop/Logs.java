package lk.ijse.gdse.aad.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {
    @After("execution(public void startTransaction())")
    public void logsForStartTransaction(){
        System.out.println("Logs for Transaction Started");
    }
    @After("execution(public void endTransaction())")
    public void logsForEndTransaction(){
        System.out.println("Logs for Transaction Ended");
    }
}
