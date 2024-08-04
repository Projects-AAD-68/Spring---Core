package lk.ijse.gdse.aad.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long hair")
public class Sarasi implements GoodGirl{
    @Override
    public void love() {
        System.out.println("Love u sandun sandun");
        System.out.println("Love u sandun sandun");
        System.out.println("Love u sandun sandun");
        System.out.println("Love u sandun sandun");
        System.out.println("Love u sandun sandun");
    }
}
