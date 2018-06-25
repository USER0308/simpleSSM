package scut.entity;

public class Book {
	private int bookId;
	private String bookName;
	private int bookPrice;
	
	public Book() {};
	
	public void setBookId(int id) {
		this.bookId = id;
	}
	
	public void setBookName(String name) {
		this.bookName = name;
	}
	
	public void setBookPrice(int price) {
		this.bookPrice = price;
	}
	
	public int getBookId() {
		return this.bookId;
	}

	public String getBookName() {
		return this.bookName;
	}
	
	public int getBookPrice() {
		return this.bookPrice;
	}
	
	public Book getBook() {
		return this;
	}
}
