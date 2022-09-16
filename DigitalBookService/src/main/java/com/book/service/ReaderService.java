package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.ReaderDemo;
import com.book.repository.ReaderRepository;

@Service
public class ReaderService {

	@Autowired
	ReaderRepository readerRepository;

	public ReaderDemo saveReader(ReaderDemo reader) {
		return readerRepository.save(reader);
	}


}