package com.example.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PortalApplication {

    public static void main(String[] args) {

        SpringApplication.run(PortalApplication.class, args);

    }

//    public void run(String... args) throws Exception {
//    UserController c=new UserController();
//    List<Users> usersList= c.listAll();
//    usersList.forEach(System.out::println);
//}

}
