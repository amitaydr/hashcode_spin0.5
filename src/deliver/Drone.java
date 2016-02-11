package deliver;

import java.util.HashMap;

public class Drone {
	private int x;
	private int y;
	private HashMap<Product,Integer> inventory;
	
	public Drone(int x, int y, HashMap<Product, Integer> inventory) {
		super();
		this.x = x;
		this.y = y;
		this.inventory = inventory;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public HashMap<Product, Integer> getInventory() {
		return inventory;
	}

	public void setInventory(HashMap<Product, Integer> inventory) {
		this.inventory = inventory;
	}

}
