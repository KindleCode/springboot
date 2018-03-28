package com.caiminjie.controller;

import com.caiminjie.entity.Demo;
import com.caiminjie.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Mr Cai on 2018/3/28.
 * @author Mr Cai
 */
@Controller
public class ProjectControler {

    @Autowired
    private DemoMapper demoMapper;

    @ResponseBody
    @RequestMapping(value = "/findAllDemo", method = RequestMethod.GET)
    public ResponseEntity findAllDemo(){
        List<Demo> demos = demoMapper.findDemo();
        return ResponseEntity.ok(demos);
    }

}
