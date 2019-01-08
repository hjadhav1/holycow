/**
 * 
 */
package com.rest.springboot.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @author hjadhav1
 *
 */
public class UserLogin {

	
@NotNull(message = "loginId Can not be null")
@Email(message = "Please provide valid email address")
private String loginId;
@NotNull(message = "Password cant be null")
private String password;
/**
 * @return the loginId
 */
public String getLoginId() {
	return loginId;
}
/**
 * @param loginId the loginId to set
 */
public void setLoginId(String loginId) {
	this.loginId = loginId;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}



}
