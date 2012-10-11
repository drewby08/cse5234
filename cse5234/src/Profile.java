import java.sql.Connection;


public class Profile {
	
	private int profileid;
	private String firstname;
	private String lastname;
	private String address;
	private String email;
	private String creditcard;

	public Profile() {

		
	}

	public Profile(int profileid, String firstname, String lastname,
			String address, String email, String creditcard) {
		this.profileid = profileid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.creditcard = creditcard;
	}

	public int getProfileid() {
		return profileid;
	}

	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}
	
	//inserts into DB
	public void insert(Connection conn){
		
	}
	
	//updates in DB
	public void update(){
		
	}
	
	//deletes from DB
	public static void delete(int profileid,Connection conn){
		
	}
	
	//fetches from the DB
	public static Profile fetch(int profileid,Connection conn){
		
		//get all the attributes, build a new profile object
		return new Profile();
	}

}
