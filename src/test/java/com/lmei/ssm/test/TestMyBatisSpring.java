package com.lmei.ssm.test;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;

import com.lmei.ssm.controller.BookController;
import com.lmei.ssm.dao.BookDao;
import com.lmei.ssm.entity.Book;

public class TestMyBatisSpring {
    @Test
    public void test() {
        //初始化容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //获得bean     
        BookDao bookDao = ctx.getBean(BookDao.class);
        //访问数据库
        List<Book> books = bookDao.getAllBook();
        for (Book book : books) {
            System.out.println(book.getBookName());
        }
        assertNotNull(books);
    }
}