package com.yyorz.wmswebapi.user.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.yyorz.wmswebapi.user.vo.UserQueryCondition;
import com.yyorz.wmswebapi.user.vo.UserVO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    @JsonView(UserVO.Public.class)
    public UserVO create(@Valid @RequestBody UserVO user, BindingResult errors) {
        user.setId("1");

        errors.getAllErrors().stream().forEach(error -> System.out.println(error.getObjectName() + " -> " + error.getDefaultMessage()));

        System.out.println(user);

        return user;
    }


    @PutMapping("/{id:\\d+}")
    @JsonView(UserVO.Public.class)
    public UserVO update(@PathVariable String id, @Valid @RequestBody UserVO user, BindingResult errors) {
        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(err -> {
                if (err instanceof FieldError) {
                    FieldError fieldError = (FieldError) err;
                    String message = fieldError.getField() + " " + fieldError.getDefaultMessage();
                    System.out.println(message);
                }

            });
        }

        user.setId(id);

        System.out.println(user);

        return user;
    }

    @GetMapping
    @JsonView(UserVO.Private.class)
    public List<UserVO> query(UserQueryCondition condition, @PageableDefault(page = 2, size = 17, sort = "username, asc") Pageable pageable) {

        System.out.println(condition);
        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());

        List<UserVO> users = new ArrayList<>();
        users.add(new UserVO("1", "1", "1", new Date()));

        String x = users.get(0).toString();
        users.add(new UserVO("2", "2", "2", new Date()));
        users.add(new UserVO("3", "3", "3", new Date()));
        return users;

    }


    @GetMapping("/{id:\\d+}")
    @JsonView(UserVO.Public.class)
    public UserVO getInfo(@PathVariable String id) {
        UserVO user = new UserVO();
        user.setUsername("ximenchuifeng");
        user.setId("1");
        user.setPassword("123");
        return user;
    }


}
