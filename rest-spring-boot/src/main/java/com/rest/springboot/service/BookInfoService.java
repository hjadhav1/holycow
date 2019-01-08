/**
 * 
 */
package com.rest.springboot.service;

import java.util.List;

import com.rest.springboot.entity.BookInfo;

/**
 * @author hjadhav1
 *
 */
public interface BookInfoService {
	public List < BookInfo > findAll();
	public long insert(BookInfo bookInfo);
}
