package com.msm.controller;


import com.msm.model.SysUser;
import com.msm.service.UserService;
import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(){
        List<SysUser> list = userService.findAll();
        logger.info(JSONArray.fromObject(list).toString());
        return "login";
    }
}
