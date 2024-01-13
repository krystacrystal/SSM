package com.atguigu.Dao.impl;

import com.atguigu.Dao.StudentDao;
import com.atguigu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Student> queryAll() {
        //jdbcTemplate进行数据库的查询  ioc容器进行装配 不要自己去实例化
        String sql = "select id , name, gender ,age , class as classes from students ";

        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));


        return studentList;
    }
}
