package com.bookstore.demosoapcf.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bookstore.demosoapcf.service.BookService;
import com.bookstore.soap_cf_demo.GetBookRequest;
import com.bookstore.soap_cf_demo.GetBookResponse;

@Endpoint
public class BooksEndPoint {

	@Autowired
	private BookService	bookService;
	
	
	@PayloadRoot(namespace = "http://bookstore.com/soap-cf-demo", 
					localPart = "getBookRequest")
	@ResponsePayload
	public GetBookResponse getBookRequest(@RequestPayload GetBookRequest request){
		GetBookResponse response = new GetBookResponse();
		response.setBook(bookService.getBooks(request.getName()));
		return response;
	}
}
