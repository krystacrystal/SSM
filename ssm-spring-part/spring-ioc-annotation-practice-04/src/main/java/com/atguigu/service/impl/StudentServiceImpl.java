package com.atguigu.service.impl;

import com.atguigu.Dao.StudentDao;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findALL() {
        List<Student> list = studentDao.queryAll();
        return list;

    }
}
