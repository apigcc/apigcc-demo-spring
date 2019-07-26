package com.apigcc.example.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class User {

    /**
     * 主键
     */
    int id;
    /**
     * 名称
     */
    @NotBlank
    String name;
    /**
     * 年龄
     */
    @Min(1)
    @NotNull
    Integer age;
    /**
     * 创建时间
     */
    Date createAt;
    /**
     * 性别
     */
    @NotBlank
    @JsonProperty("Sex")
    String sex;

}
