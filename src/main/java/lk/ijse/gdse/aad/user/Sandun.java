package lk.ijse.gdse.aad.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse.aad.dep.GoodGirl;
import lk.ijse.gdse.aad.dep.Wow;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sandun {
    @Qualifier("Long hair")

   private GoodGirl goodGirl;
    //----------------Constructor injection---------------
//    @Autowired
//    @Wow
//   public Sandun(GoodGirl goodGirl){
//        this.goodGirl = goodGirl;
//   }
    //----------------Setter injection---------------
@Autowired
@Wow
   public void setGoodGirl(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
   }

   @PostConstruct
   public void init(){
       //System.out.println(goodGirl);
       goodGirl.love();
   }

}
