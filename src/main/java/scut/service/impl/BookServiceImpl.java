package scut.service.impl;
import scut.entity.Book;
import scut.service.IBookService;

import org.springframework.beans.factory.annotation.Autowired;

import scut.dao.IBookDAO;
public class BookServiceImpl implements IBookService{

	@Autowired(required=false)  
	private IBookDAO ibookDao;
	
	public void addBook(Book book) {
		ibookDao.addBook(book);
	}
	
	public Book queryBook(String bookName) {
		return ibookDao.queryBook(bookName);
	}

}
