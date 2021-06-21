package cn.chasing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柴柴快乐每一天
 * @create 2021-06-16  10:27 上午
 * <p>
 * 『Stay hungry, stay foolish. 』
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2!";
    }


}
