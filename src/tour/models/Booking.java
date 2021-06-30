package tour.models;

public class Booking {
	public int id;
	public String user;
	public String email;
	public String tourpack;
	public String start;
	public int days;
	public String bookingdate;
	public String status;
	public int amount;
	
	
	public Booking(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public Booking(String user, String email, String tourpack, String start, int days, String bookingdate,String status,int amount) {
		super();
		this.user = user;
		this.email = email;
		this.tourpack = tourpack;
		this.start = start;
		this.days = days;
		this.bookingdate = bookingdate;
		this.status = status;
		this.amount = amount;
	}
	public Booking(String user, String email, String tourpack, String start, int days, String bookingdate,int amount) {
		super();
		this.user = user;
		this.email = email;
		this.tourpack = tourpack;
		this.start = start;
		this.days = days;
		this.bookingdate = bookingdate;
		
		this.amount = amount;
	}
	public Booking(int id, String user, String email, String tourpack, String start, int days, String bookingdate,String status,int amount) {
		super();
		this.id = id;
		this.user = user;
		this.email = email;
		this.tourpack = tourpack;
		this.start = start;
		this.days = days;
		this.bookingdate = bookingdate;
		this.status = status;
		this.amount = amount;
	}
	
	public Booking(int id2, String user2, String email2, String tourpack2, String start2, int days2,
			String bookingdate2, int amount2) {
		// TODO Auto-generated constructor stub
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTourpack() {
		return tourpack;
	}
	public void setTourpack(String tourpack) {
		this.tourpack = tourpack;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	
	
	
}
