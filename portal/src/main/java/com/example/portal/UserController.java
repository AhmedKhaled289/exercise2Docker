package com.example.portal;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.*;

@RestController
public class UserController {
    @GetMapping(value={"", "/"})
    public ArrayList<Users> listAll() {
        ArrayList<Users> users=new ArrayList<Users>();
        ObjectMapper mapper = new ObjectMapper();
        Users[] readValue ;
        try {
            readValue = mapper.readValue(new URL("https://jsonplaceholder.typicode.com/users"), Users[].class);
        for (Users user:
                    readValue) {
                users.add(user);
            }

        final String uri = "http://apihost:8081/users/saveAll";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(uri, users, Users.class);

        } catch (Exception e) {
        }

        return users;
    }

}
