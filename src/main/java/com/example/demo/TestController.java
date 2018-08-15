package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2018/8/15.
 */
@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public Map test(){
        return getResult();
    }
    @PostMapping("/test")
    @ResponseBody
    public Map test1(){
        return getResult();
    }
    private Map<String,String> getResult(){
        Map<String,String> map = new LinkedHashMap<>();
        map.put("falg","failure");
        map.put("sub_message","Illegal request");
        map.put("sub_code","sign-check-failure");
        return map;
    }
}
