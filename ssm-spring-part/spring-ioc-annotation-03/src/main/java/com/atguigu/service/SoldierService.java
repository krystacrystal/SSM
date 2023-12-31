package com.atguigu.service;

import com.atguigu.dao.SoldierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoldierService {

    @Autowired
    private SoldierDao soldierDao;

    public void getMessage() {
        soldierDao.getMessage();
    }
}
