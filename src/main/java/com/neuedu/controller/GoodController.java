package com.neuedu.controller;

import com.neuedu.pojo.Good;
import com.neuedu.service.good.GoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/good")
public class GoodController {
    @Resource
    GoodService goodService;
    @GetMapping("/list")
    public String list(ModelMap modelMap){
        modelMap.addAttribute("list", goodService.list());
        return "good/list";
    }
    @GetMapping("/ajax")
    @ResponseBody
    public String ajax(Integer id){
        System.out.println(id);
        return "aaaaa";
    }
}
