package com.apigcc.example.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PageResult<T> {

    List<T> content;

    Code code;

}
