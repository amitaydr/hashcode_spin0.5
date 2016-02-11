package deliver;

import java.util.HashMap;

public class Warehouse {
	private Point location;
	private HashMap<Product,Integer> inventory;
	
	public Warehouse(int x, int y, HashMap<Product, Integer> inventory) {
		super();
		this.location = new Point(x,y);
		this.inventory = inventory;
	}



	public Point getLocation() {
		return location;
	}



	public void setLocation(Point location) {
		this.location = location;
	}



	public HashMap<Product, Integer> getInventory() {
		return inventory;
	}

	public void setInventory(HashMap<Product, Integer> inventory) {
		this.inventory = inventory;
	}
}
