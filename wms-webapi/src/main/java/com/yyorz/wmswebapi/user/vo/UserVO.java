package com.yyorz.wmswebapi.user.vo;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

//    public UserVO(String id, String username, String password) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//    }


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
