package com.lyp.learn.controller;

import com.lyp.learn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 10:33
 */
@Controller
public class BookController {

    @Autowired
    BookService bookService;
}
