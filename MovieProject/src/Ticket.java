

public class Ticket {
	
	int ticketId;
	String movieName;
	double ticketPrice;
	int ticketCount;
	public Ticket(int ticketId, String movieName, double ticketPrice, int ticketCount) {
		super();
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.ticketCount = ticketCount;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
