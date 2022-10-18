package com.example.servicelayer;

import com.example.servicelayer.DTO.UsersDto;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @Resource(name = "userService")
    private UserService userService;

    @PostMapping(value = "/saveAll")
    public String saveAll(@RequestBody ArrayList<UsersDto> users){
        ArrayList<Users> users1=new ArrayList<>();
        for (UsersDto user:
        users) {
          Users  usersReturned=userService.saveUsers(user);
            users1.add(usersReturned);
        }
        return "AddedSuccesfully";

    }
    @PostMapping(value = "")
    public Users save(@RequestBody Users user){
        return userService.saveUser(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUsers(@PathVariable Long id){

        userService.deleteUsers(id);
    }
    @PutMapping(value = "/{id}")
    public Users updateUsers(@PathVariable Long id , @RequestBody UsersDto usersDto){

        return userService.updateUsers(id,usersDto);
    }
    @GetMapping(value ="")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();

    }
    @GetMapping(value = "/{id}")
    public Users getUsersByID(@PathVariable Long id){

        return userService.getUsersByID(id);
    }

}
