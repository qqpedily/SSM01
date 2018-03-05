package com.lmei.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lmei.ssm.entity.Book;
import com.lmei.ssm.service.BookService;

@Controller
@RequestMapping("/Book")
public class BookController {

	@Resource
	BookService bookService;

	@RequestMapping("/getAllBook")
	public String getAllBook(Model model) {
		List<Book> books = bookService.getAllBook();
		for (Book book : books) {
			System.out.println(book.getBookName());
		}
		
		model.addAttribute("books", books);
		return "Book/index";
	}
}