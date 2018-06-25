package scut.service;

import scut.entity.Book;

public interface IBookService {
	void addBook(Book book);
	Book queryBook(String bookName);
}
