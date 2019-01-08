/**
 * 
 */
package com.rest.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hjadhav1
 *
 */
@Entity
@Table(name="bookInfo")
public class BookInfo {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 private String name; // Not perfect!! Should be a proper object!
	 private String link; // Not perfect!! An enum should be a better choice!
	 private String description; // Not perfect!! An enum should be a better choice!
	 protected BookInfo() {}
	 public BookInfo(String name, String link,String description) {
	  super();
	  this.name = name;
	  this.link = link;
	  this.description = description;
	 }
	 public Long getId() {
	  return id;
	 }
	 
	 /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	 public String toString() {
	  return String.format("BookInfo [id=%s, name=%s, link=%s]", id, name, link);
	 }

}
