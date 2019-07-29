package com.apigcc.example.advanced;

import com.apigcc.example.common.*;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

/**
 * 用户模块（标题）
 * 用户示例模块文字描述（详情）
 * 详情支持多行文字
 * @index 2
 */
@RestController
@RequestMapping("/users")
public class UserController extends BaseController {

    /**
     * 用户详情信息
     * 根据id获取用户的信息
     *
     * [TIP]
     * 注意，不会返回密码
     *
     *
     *
     * @param id 用户编号
     * @return
     */
    @GetMapping("/{id}")
    public ResultData<User> get(@PathVariable String id) {
        return ResultData.ok(new User());
    }

    /**
     * 根据手机号搜索用户信息
     * apigcc根据方法返回类型解析，并不解析实际执行代码
     * @param phone
     * @return
     */
    @GetMapping("/search")
    public ResultData<List<User>> search(@RequestParam String phone){
        return ResultData.ok();
    }

    /**
     * 用户信息新增
     *
     * @param user 用户信息
     * @return
     */
    @PostMapping
    public ResultData add(@RequestBody UserDTO user) {
        return ResultData.ok();
    }

    /**
     * 用户信息更新
     *
     * @param user 用户信息
     * @return
     */
    @PutMapping
    public ResultData update(@RequestBody UserDTO user) {
        return ResultData.ok();
    }

    /**
     * 用户列表信息查询
     * 默认展示GET方法查询
     * 返回集合类的结果
     *
     * @param page 页码
     * @param size 每页条数
     * @return
     */
    @RequestMapping("/list")
    public ResultData<Iterator<User>> list(@RequestParam(defaultValue = "1") int page,
                                           @RequestParam(defaultValue = "20") int size) {
        return ResultData.ok();
    }

    /**
     * 用户信息分页查询
     *
     * @param page 页码
     * @param size 每页条数
     * @return
     */
    @RequestMapping("/list")
    public ResultData<PageResult<User>> page(@RequestParam(defaultValue = "1") int page,
                                           @RequestParam(defaultValue = "20") int size) {
        return ResultData.ok();
    }


    /**
     * 更新角色
     * @return 是否成功
     */
    @PutMapping("role")
    public Boolean role(){
        return true;
    }

}
