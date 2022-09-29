package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.PurchasedBook;
import com.book.service.PurchasedBookService;

@RestController
@RequestMapping("/Readers")


public class ReaderController {
	
	
	

	@Autowired
	PurchasedBookService purchasedBookService;

	
	@GetMapping("/{emailId}/books")
	public List<PurchasedBook> getAllPurchasedBooks(@PathVariable("emailId") String email) {
		return purchasedBookService.getPurchasedBook(email);

	}

}
