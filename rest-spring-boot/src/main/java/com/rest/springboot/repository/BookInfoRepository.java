/**
 * 
 */
package com.rest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.springboot.entity.BookInfo;

/**
 * @author hjadhav1
 *
 */
@Repository
public interface BookInfoRepository extends JpaRepository<BookInfo,Long>{

}
