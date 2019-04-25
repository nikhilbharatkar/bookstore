package com.bookstore.demosoapcf.service;

import javax.annotation.PostConstruct;

import com.bookstore.soap_cf_demo.Book;

public interface BookService {

	void initialize();

	Book getBooks(String Name);

}