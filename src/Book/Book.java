package Book;

public class Book {
	private String title;
	private String author;
	private int pages;
	private double price;
	
	public Book (String title, String author, int pages, double price){
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public int getPages(){
		return this.pages;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public void setPrice(double newPrice){
		this.price = newPrice;
	}
	
	public double pricePerPage(){
		return this.pages / this.price;
	}
}
