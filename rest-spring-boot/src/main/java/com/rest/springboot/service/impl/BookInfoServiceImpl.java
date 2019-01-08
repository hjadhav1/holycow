/**
 * 
 */
package com.rest.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.springboot.entity.BookInfo;
import com.rest.springboot.repository.BookInfoRepository;
import com.rest.springboot.service.BookInfoService;

/**
 * @author hjadhav1
 *
 */
@Service
public class BookInfoServiceImpl implements BookInfoService{
	
	@Autowired
	private BookInfoRepository bookInfoRepository;
	 /**
	 * @param bookInfoRepository the bookInfoRepository to set
	 */
	public void setBookInfoRepository(BookInfoRepository bookInfoRepository) {
		this.bookInfoRepository = bookInfoRepository;
	}

	 public long insert(BookInfo bookInfo) {
		 bookInfoRepository.save(bookInfo);
	  return bookInfo.getId();
	 }
	
	 public List < BookInfo > findAll() {
	  return bookInfoRepository.findAll();
	 }
}
