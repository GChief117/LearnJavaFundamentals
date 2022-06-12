import java.util.HashMap;
import java.util.Map;

public class Book implements Comparable{ //comparable is a generic type
	private String title;
	private String author;
	private double price;
	
	
	public Book () {
		//default consturcotr
	}
	
	/**
	 * 
	 * @param title
	 * @param author
	 * @param price
	 */
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		return - this.title.compareTo(((Book) o).getTitle());//delegate the method to particualre parameter to the class
		//if add - between return and this, we willge the reverse order
		//if this title should come before o.getTitle() then return -1
		//if this title should come before o.getTitle() then return +1
//Otherwise return 0. 
	}

	
	
	
	
	///try sorting a lsit of books
	
	

}
