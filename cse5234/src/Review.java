import java.sql.Connection;


public class Review {
	
	private int reviewid;
	private String isbn;
	private int userid;
	private int stars;
	private String review;

	public Review() {
		
	}

	public Review(int reviewid, String isbn, int userid, int stars, String review) {
		super();
		this.reviewid = reviewid;
		this.isbn = isbn;
		this.userid = userid;
		this.stars = stars;
		this.review = review;
	}

	public int getReviewid() {
		return reviewid;
	}

	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	//inserts into DB
	public void insert(Connection conn){
		
	}
	
	//updates in DB
	public void update(){
		
	}
	
	//deletes from DB
	public static void delete(int reviewid,Connection conn){
		
	}
	
	//fetches from the DB
	public static Review fetch(int reviewid,Connection conn){
		
		return new Review();
	}

}
