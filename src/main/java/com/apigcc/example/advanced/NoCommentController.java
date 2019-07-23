package com.apigcc.example.advanced;

import com.apigcc.example.common.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/no/comment")
public class NoCommentController extends BaseController{

    @PostMapping
    public ResultData method(@RequestHeader() String name){
        return ResultData.ok();
    }

}
