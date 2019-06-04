package com.yyorz.wmswebapi.user.vo;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
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
