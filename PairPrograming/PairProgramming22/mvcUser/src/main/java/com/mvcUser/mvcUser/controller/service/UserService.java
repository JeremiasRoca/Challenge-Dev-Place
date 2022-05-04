package com.mvcUser.mvcUser.controller.service;


import com.mvcUser.mvcUser.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers(){

        String url = "http://localhost:8090/users";
        RestTemplate restT = new RestTemplate();
        ArrayList<User> users = new ArrayList<User>();
        users = restT.getForObject(url,ArrayList.class);
        return users;
    }

    public User getOneUser(int id) {
        String url = ("http://localhost:8090/users/"+id);
        RestTemplate restT = new RestTemplate();
        User user = new User();
        user= restT.getForObject(url,User.class);
        return user;
    }


    public void saveUser(User user) {
        String url = "http://localhost:8090/users";
        RestTemplate restT = new RestTemplate();
        restT.postForObject(url, user, User.class);
    }

    public void deleteUser(int id) {
        String url = ("http://localhost:8090/users/"+id);
        RestTemplate restT = new RestTemplate();
        restT.delete(url);
    }

}
