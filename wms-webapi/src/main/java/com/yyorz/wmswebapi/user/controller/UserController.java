package com.yyorz.wmswebapi.user.controller;

import com.yyorz.wmswebapi.user.vo.UserQueryCondition;
import com.yyorz.wmswebapi.user.vo.UserVO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public List<UserVO> query(UserQueryCondition condition, @PageableDefault(page = 2, size = 17, sort = "username, asc") Pageable pageable){

        System.out.println(condition);
        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());

        List<UserVO> users = new ArrayList<>();
        users.add(new UserVO("1","1","1"));

        String x = users.get(0).toString();
        users.add(new UserVO("2","2","2"));
        users.add(new UserVO("3","3","3"));
        return users;

    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserVO getInfo(@PathVariable String id){
        UserVO user = new UserVO();
        user.setUsername("ximenchuifeng");
        return user;
    }
}
