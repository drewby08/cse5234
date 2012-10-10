import java.math.BigDecimal;

public class Ebook {
	
	private int isbn;
	private String title;
	private String author;
	private BigDecimal price;
	
	public Ebook(){
		
	}
	
	public Ebook(int isbn, String title, String author, BigDecimal price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		
	}

	public int getIsbn() {
		return this.isbn;
	}

	public void setIsbn(int isbn) {
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

}
