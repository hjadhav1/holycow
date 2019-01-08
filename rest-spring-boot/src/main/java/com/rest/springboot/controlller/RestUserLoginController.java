/**
 * 
 */
package com.rest.springboot.controlller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springboot.bean.UserLogin;
import com.rest.springboot.service.BookInfoService;

/**
 * @author hjadhav1
 *
 */
@RestController
@RequestMapping("/api/v1")
public class RestUserLoginController {
	
	 @Autowired
	 private BookInfoService bookInfoService;
	 
	/**
	 * @param bookInfoService the bookInfoService to set
	 */
	public void setBookInfoService(BookInfoService bookInfoService) {
		this.bookInfoService = bookInfoService;
	}

	@GetMapping("/users")
	  public String ValidateUsers(@Valid @RequestBody UserLogin userDetails)
	      throws ResourceNotFoundException {
	    System.out.println(userDetails.getLoginId());
	    System.out.println(userDetails.getPassword());
	    System.out.println(bookInfoService.findAll().toString());
	    return "User Validation Success";
	  }

}
