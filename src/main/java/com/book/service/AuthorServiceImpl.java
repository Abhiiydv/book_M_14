package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Author;

@Service
public class AuthorServiceImpl implements IAuthorService {

	
	@Autowired
	private IAuthorRepository authorrepo;
	
	
	@Override
	public Integer createAuthor(Author a) {
		// TODO Auto-generated method stub
		Author savedAuthor = authorrepo.save(a);
		return savedAuthor.getAuthorId();
	}

}
