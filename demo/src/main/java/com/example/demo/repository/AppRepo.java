package com.example.demo.repository;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository

import com.example.demo.model.AppModel

public class AppRepo {

    @Repository
    public interface UserRepository extends Repository

            java.util.List<User> findAll();-User,long>{

    }

}
