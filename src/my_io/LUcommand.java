package my_io;

public class LUcommand extends Command {
	private int drone;
	private char command;
	private int warehouse;
	private int product;
	private int quantity;
	private String delim;
	
	
	public LUcommand(int drone, char command, int warehouse, int product, int quantity) {
		super();
		this.drone = drone;
		this.command = command;
		this.warehouse = warehouse;
		this.product = product;
		this.quantity = quantity;
		delim = " ";
	}


	@Override
	public String toString() {
		return drone + delim + command + delim + warehouse + delim + product + delim + quantity;
	}
	
	
	
	
}
