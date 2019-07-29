package com.apigcc.example.advanced;

import com.apigcc.example.common.Menu;
import com.apigcc.example.common.UserDTO;
import org.jruby.ir.Tuple;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 工具类
 * 使用工具类作为参数或返回值
 * 比如 ResponseEntity、Model、ModelAndView等
 * @index 3
 */
@RestController
@RequestMapping("/unknow")
public class UnknowController extends BaseController {

    /**
     * ResponseEntity
     * @return
     */
    @GetMapping("/info")
    public ResponseEntity<UserDTO> info(){
        return ResponseEntity.ok().build();
    }
    /**
     * ModelAndView Model
     * 不推荐使用
     * @return
     */
    @GetMapping("/mv")
    public ModelAndView mv(Model model){
        return new ModelAndView();
    }

    /**
     * Tuple
     * @return
     */
    @GetMapping("tuple")
    public Tuple<String,Integer> tuple(){
        return null;
    }


}
