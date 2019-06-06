package com.yyorz.wmswebapi.user.vo;


import com.fasterxml.jackson.annotation.JsonView;
import com.yyorz.wmswebapi.user.validator.MyConstraint;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserVO {

    public interface Private {
    }

    public interface Public extends Private {
    }

    @Getter
    @Setter
    @JsonView(Private.class)
    private String id;

    @Getter
    @Setter
    @JsonView(Private.class)
    @MyConstraint(message = "他不是GOD")
    private String username;


    @Getter
    @Setter
    @NotBlank(message = "密码不能为空")
    @JsonView(Public.class)
    private String password;


    @Getter
    @Setter
    @JsonView(Public.class)
    @Past(message = "生日必须小于现在")
    private Date birthday;


}
