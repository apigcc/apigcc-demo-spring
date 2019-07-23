package com.apigcc.example.common;

import lombok.Setter;

@Setter
public class UserQuery extends Page {

    /**
     * 名称
     * @value apigcc
     */
    String name;

    public String getName() {
        return name;
    }
}
