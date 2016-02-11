package my_io;

public class Dcommand extends Command {
	private int drone;
	private int order;
	private int product;
	private int quantity;
	private String delim;
	
	
	public Dcommand(int drone, int order, int product, int quantity, String delim) {
		super();
		this.drone = drone;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.delim = delim;
	}


	@Override
	public String toString() {
		return drone + " D " + order + delim + product + delim + quantity;
	}
	
	
	
	
}
