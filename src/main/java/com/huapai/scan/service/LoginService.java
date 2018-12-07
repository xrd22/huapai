package com.huapai.scan.service;

import com.alibaba.fastjson.JSON;
import com.huapai.mybatis.dao.UserMapper;
import com.huapai.mybatis.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    public  User  gitUser() {
        User user = userMapper.selectByPrimaryKey(1003);
       return user;
    }

}
