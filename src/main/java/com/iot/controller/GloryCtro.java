package com.iot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiongxiaoyu on 2017/12/7.
 */


@Controller
public class GloryCtro {

    @RequestMapping({"/","/glory"})
    public String glory(){
        return  "glory";
    }
}
