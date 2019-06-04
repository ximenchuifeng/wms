package com.yyorz.wmswebapi.user.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class UserQueryCondition {
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

}
