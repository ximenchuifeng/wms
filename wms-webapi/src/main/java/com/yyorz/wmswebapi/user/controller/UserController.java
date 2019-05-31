package com.yyorz.wmswebapi.user.controller;

import com.yyorz.wmswebapi.user.vo.UserVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public List<UserVO> query(){
        List<UserVO> users = new ArrayList<>();
        users.add(new UserVO("1","1","1"));

        String x = users.get(0).toString();
        users.add(new UserVO("2","2","2"));
        users.add(new UserVO("3","3","3"));
        return users;

    }

}
