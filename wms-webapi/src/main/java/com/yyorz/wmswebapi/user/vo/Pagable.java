package com.yyorz.wmswebapi.user.vo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Pagable {
    @Getter @Setter
    private int page;

    @Getter @Setter
    private int size;

}
