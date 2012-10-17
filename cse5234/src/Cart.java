import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Cart {

	private int cartid;
	private String isbn;
	private String downloadlink;
	
	public Cart() {

	}

	public Cart(int cartid, String isbn, String downloadlink) {
		this.cartid = cartid;
		this.isbn = isbn;
		this.downloadlink = downloadlink;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDownloadlink() {
		return downloadlink;
	}

	public void setDownloadlink(String downloadlink) {
		this.downloadlink = downloadlink;
	}
	
	//inserts into DB
	public void insert(Connection conn){
		
		PreparedStatement statement = null;
		try {
			statement = conn.prepareStatement("insert into cart values(?,?,?)");
			statement.setInt(1, this.cartid);
			statement.setString(2, this.isbn);
			statement.setString(3, this.downloadlink);
			statement.execute();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
	
	//updates in DB
	public void update(){
		
	}
	
	//deletes from DB
	public static void delete(int cartid,Connection conn){
		
	}
	
	//fetches from the DB
	public static Cart fetch(int cartid,Connection conn){
		
		return new Cart();
	}
	
	
}
