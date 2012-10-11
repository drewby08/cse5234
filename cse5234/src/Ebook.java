import java.math.BigDecimal;
import java.sql.Connection;

public class Ebook {
	
	private String isbn;
	private String title;
	private String author;
	private BigDecimal price;
	
	public Ebook(){
		
	}
	
	public Ebook(String isbn, String title, String author, BigDecimal price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	//inserts into DB
	public void insert(Connection conn){
		
	}
	
	//updates in DB
	public void update(Connection conn){
		
	}
	
	//deletes from DB
	public static void delete(int isbn,Connection conn){
		
	}
	
	//fetches from the DB
	public static Ebook fetch(String isbn,Connection conn){
		
		return new Ebook();
	}

}
