package com.apigcc.example.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Setter
@Getter
public class UserDTO {

    /**
     * 编号
     */
    Integer id;
    /*姓名*/
    @Size(min = 5, max = 20)
    @NotEmpty
    String name;
    //年龄
    @Min(1)
    int age;
    /**
     * 生日，还是推荐使用javadoc
     */
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date birthday;
    /**
     * 用户标签
     */
    @Size(min = 1, max = 2)
    List<String> tags;

    List<?> data;
    /**
     * 用户图标
     */
    String[] icons;

    //不支持Map，碰到Map忽略
    Map<String, String> attrs;


}
