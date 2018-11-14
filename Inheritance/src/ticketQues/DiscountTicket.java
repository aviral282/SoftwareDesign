package ticketQues;

public class DiscountTicket extends Ticket{
	int discount;
	public DiscountTicket(int p, String s, String e,int d) {
		super(p, s, e);
		discount = d ;
	}

	public void setPrice(int i) {
		// TODO Auto-generated method stub
		super.setPrice(i);
		
	}

	public int readPrice() {
		// TODO Auto-generated method stub
		return super.readPrice();
	}

	public void setDiscount(int d) {
		// TODO Auto-generated method stub
		discount = d;
		
	}

	public int grossPrice() {
		// TODO Auto-generated method stub
		return price-discount;
	}

}
