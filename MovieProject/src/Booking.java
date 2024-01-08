

public class Booking {
	
	public static void main(String[] args) {
		Ticket tik1 = new Ticket(101,"KGF - 2",120,3);
		Ticket tik2 = new Ticket(102,"Jailor",150,2);
		
		System.out.println("Movie name "+tik1.getMovieName());
		System.out.println("Movie name "+tik2.getMovieName());
	}

}
