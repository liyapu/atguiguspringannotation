package com.lyp.learn.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Random;
import java.util.UUID;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-04 10:41
 */
@Repository
public class PictureDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertPicture(){
        String sql = "INSERT INTO picture (name,age) VALUES(?,?)";
        String name = UUID.randomUUID().toString().substring(0,5);
        int age = new Random().nextInt(100);
        jdbcTemplate.update(sql,name,age);
    }
}
