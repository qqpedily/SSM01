package com.lmei.ssm.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.lmei.ssm.dao.BookDao;
import com.lmei.ssm.entity.Book;
import com.lmei.ssm.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Resource
	BookDao bookDao;
	
	public List<Book> getAllBook() {	
		return bookDao.getAllBook();
	}
}