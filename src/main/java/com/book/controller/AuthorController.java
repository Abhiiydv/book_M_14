package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Author;
import com.book.service.IAuthorService;

@RestController
@CrossOrigin
public class AuthorController {

	@Autowired
	private IAuthorService auServ;
	
	
	@PostMapping("/create-author")
	Integer registerAuthor(@RequestBody Author a)
	{
		Integer i = auServ.createAuthor(a);
		return i;
	}
	
	
}
