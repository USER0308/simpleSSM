package scut.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scut.entity.Book;
import scut.service.IBookService;

public class BookServiceImplTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IBookService bookService = (IBookService)ac.getBean("bookService");
		Book book = new Book();
		book.setBookId(121);
		book.setBookName("Book Name");
		book.setBookPrice(888);
		System.out.println("book id is:");
		System.out.println(book.getBookId());
		System.out.println("book name is:");
		System.out.println(book.getBookName());
		System.out.println("book price is:");
		System.out.println(book.getBookPrice());
//		bookService.addBook(book);
		Book b = bookService.queryBook("bb");
		System.out.println("book name is:");
		System.out.println(b.getBookName());
		System.out.println("book price is:");
		System.out.println(b.getBookPrice());
	}

}
