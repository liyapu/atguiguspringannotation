package com.lyp.learn;

import com.lyp.learn.tx.PictureService;
import com.lyp.learn.tx.TxConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTxTest {


   @Test
   public void test01(){
       ApplicationContext ac =  new AnnotationConfigApplicationContext(TxConfig.class);
       PictureService pictureService = (PictureService) ac.getBean("pictureService");
       pictureService.addPicture();
//       pictureService.insertPicture();


   }

    public void printAllBeans(ApplicationContext ac){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

}
