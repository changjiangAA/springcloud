package com.jiang.feign.controller;

import com.jiang.feign.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ApiController {

    @Resource
    private ApiService apiService;

    @RequestMapping("index")
    public String index() {
        return apiService.index();
    }
}