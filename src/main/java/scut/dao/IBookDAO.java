package scut.dao;
import org.apache.ibatis.annotations.Param;

import scut.entity.Book;

public interface IBookDAO {
	public void addBook(Book book);
	public Book queryBook(@Param("bookName")String bookName);
}
