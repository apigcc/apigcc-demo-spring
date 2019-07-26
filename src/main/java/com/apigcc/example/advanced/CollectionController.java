package com.apigcc.example.advanced;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 集合
 * 使用集合作为参数或返回值
 * @index 3
 * @book collection
 */
@RestController
@RequestMapping("/collection")
public class CollectionController extends BaseController {

    /**
     * List<String>
     * @return
     */
    @PostMapping("lists")
    public List<String> lists(@RequestBody List<String> lists){
        return null;
    }

    /**
     * Set<String>
     * @return
     */
    @PostMapping("sets")
    public Set<String> sets(@RequestBody Set<String> sets){
        return null;
    }

    /**
     * Collection<String>
     * @return
     */
    @PostMapping("collections")
    public Collection<String> collections(@RequestBody Collection<String> collections){
        return null;
    }

    /**
     * Iterable<String>
     * @return
     */
    @PostMapping("iterable")
    public Iterable<String> iterable(@RequestBody Iterable<String> iterable){
        return null;
    }

    /**
     * Iterator<String>
     * @return
     */
    @PostMapping("iterator")
    public Iterator<String> iterator(@RequestBody Iterator<String> iterator){
        return null;
    }

    /**
     * ArrayList<String>
     * @return
     */
    @PostMapping("arrayList")
    public ArrayList<String> arrayList(@RequestBody ArrayList<String> arrayList){
        return null;
    }

    /**
     * String[]
     * @return
     */
    @PostMapping("array")
    public String[] array(@RequestBody String[] array){
        return null;
    }

    /**
     * No T
     */
    @GetMapping("/t")
    public List<?> noT(){
        return null;
    }

}
