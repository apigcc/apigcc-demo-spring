package com.apigcc.example.advanced;

import com.apigcc.example.common.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Header
 */
@RestController
@RequestMapping("header")
public class HeaderController {

    public static final String HEADER_JSON = "Accept: application/json";

    /**
     * Mapping headers
     */
    @GetMapping(value = "headers",headers = HEADER_JSON)
    public void headers(){

    }

    /**
     * Mapping consumers
     */
    @GetMapping(value = "consumers",consumes = "application/json")
    public void consumers(){

    }

    /**
     * Mapping produces
     */
    @GetMapping(value = "produces",produces = "application/json")
    public List produces(){
        return null;
    }

    /**
     * RequestHeader
     */
    @GetMapping(value = "RequestHeader",produces = "application/json")
    @ResponseStatus(code = HttpStatus.CREATED)
    public User produces(@RequestHeader(defaultValue = "json") String token){

        return null;
    }



}
