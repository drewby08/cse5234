import java.sql.Connection;


public class User {
	
	private int userid;
	private int cartid;
	private int profileid;
	private String password;
	private boolean admin;
	
	public User(){
		
	}

	public User(int userid, int cartid, int profileid, String password,
			boolean admin) {
		this.userid = userid;
		this.cartid = cartid;
		this.profileid = profileid;
		this.password = password;
		this.admin = admin;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getProfileid() {
		return profileid;
	}

	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


	//inserts into DB
	public void insert(Connection conn){
		
	}
	
	//updates in DB
	public void update(){
		
	}
	
	//deletes from DB
	public static void delete(int userid,Connection conn){
		
	}
	
	//fetches from the DB
	public static User fetch(int userid,Connection conn){
		
		return new User();
	}

}
