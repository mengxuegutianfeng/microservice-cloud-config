package com.tianfeng.demo.springannotion.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void insert(){
        userDao.insert();
        System.out.println("插入完成...");
    }
}
