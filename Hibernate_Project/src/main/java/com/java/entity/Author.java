package com.java.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;

@Entity
@Table(name = "author")
public class Author {
	
@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Book> getBooks() {
	return books;
}

public void setBooks(List<Book> books) {
	this.books = books;
}

@Column(name = "name")
private String name;

/*@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name="author_id")*/
@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Book.class)
@JoinColumn(name ="author_id")
private List<Book> books;

}
