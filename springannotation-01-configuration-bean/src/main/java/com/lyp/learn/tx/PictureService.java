package com.lyp.learn.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-04 10:44
 */
@Service
@Transactional
public class PictureService {

    @Autowired
    PictureDao pictureDao;


    public void addPicture() {
        pictureDao.insertPicture();
        System.out.println("插入完成.....addPicture...");
       // insertPicture();
        //int a = 10/0;
    }

    @Transactional
    public void insertPicture() {
        pictureDao.insertPicture();
        System.out.println("插入完成.....insertPicture...");
        int a = 10 / 0;
    }}
