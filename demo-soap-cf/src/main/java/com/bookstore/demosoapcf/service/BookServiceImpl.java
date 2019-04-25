package com.bookstore.demosoapcf.service;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.bookstore.soap_cf_demo.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {
private static final Map<String,Book> books= new HashMap<>();
	
	@Override
	@PostConstruct
	public void initialize() {
		Book book1 = new Book();
		book1.setName("Head First Java");
		book1.setPrice(500);
		book1.setCatalog(10.55);
		
		Book book2 = new Book();
		book2.setName("Effective Java");
		book2.setPrice(1000);
		book2.setCatalog(57.12);
		
		Book book3 = new Book();
		book3.setName("Spring in action");
		book3.setPrice(2000);
		book3.setCatalog(24.19);
				
		books.put(book1.getName(), book1);
		books.put(book2.getName(), book2);
		books.put(book3.getName(), book3);
	}
	
	@Override
	public Book getBooks(String Name) {
		
		return books.get(Name);
	}
}
