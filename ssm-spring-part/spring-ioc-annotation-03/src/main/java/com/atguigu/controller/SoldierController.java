package com.atguigu.controller;

import com.atguigu.service.SoldierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SoldierController {
    @Autowired
    private SoldierService soldierService;

    public void getMessage() {
        soldierService.getMessage();
    }
}
