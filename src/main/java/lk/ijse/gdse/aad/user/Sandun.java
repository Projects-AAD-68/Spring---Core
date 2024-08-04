package lk.ijse.gdse.aad.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse.aad.dep.GoodGirl;
import lk.ijse.gdse.aad.dep.Wow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sandun {
    @Autowired
    @Qualifier("Long hair")
    @Wow
   private GoodGirl goodGirl;

//   public Sandun(){
//       System.out.println(goodGirl);
//   }
   @PostConstruct
   public void init(){
       //System.out.println(goodGirl);
       goodGirl.love();
   }

}
