package com.lyp.learn.service;

import com.lyp.learn.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 10:33
 */
@Service
public class BookService {

//    @Qualifier("bookRepositoryOracle")
    @Autowired
    BookRepository bookRepository;

    @Override
    public String toString() {
        return "BookService{" +
                "bookRepository=" + bookRepository +
                '}';
    }
}
