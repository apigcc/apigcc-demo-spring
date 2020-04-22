package com.apigcc.example.advanced;

import com.apigcc.example.common.Menu;
import com.apigcc.example.common.UserQuery;
import org.springframework.web.bind.annotation.*;

/**
 * Parameter
 */
@RestController
@RequestMapping("parameter")
public class ParameterController {

    /**
     * RequestParam
     * @param value 名称
     */
    @GetMapping
    public void get(@RequestParam(name = "name",required = false,defaultValue = "apigcc") String value){
    }

    /**
     * RequestBean
     * @param query
     */
    @GetMapping
    public void query(UserQuery query){

    }

    /**
     * RequestBody
     * @param query
     */
    @PostMapping
    public void body(@RequestBody(required = false) UserQuery query){

    }

    /**
     * Menu
     * @return
     */
    @GetMapping("menu")
    public Menu menu(Menu menu){
        return null;
    }

    /**
     * Also Json Body When Not GetMapping
     * @param name
     * @param age
     */
    @PostMapping
    public void post(String name, int age){

    }
}
