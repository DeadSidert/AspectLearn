package com.nik.up.Service;

import com.nik.up.Dao.User;
import org.springframework.stereotype.Service;

@Service
public class Work {

    User user;

    public Work(User user) {
        this.user = user;
    }

    public void userInfo(){
        int age = user.userWelcome();
         if(age >= 18){
             System.out.println("Go work");
         }
         else System.out.println("Go home");
    }
}
