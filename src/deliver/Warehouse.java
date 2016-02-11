package deliver;

import java.util.HashMap;
import java.util.List;

public class Warehouse {
	private Point location;
	private HashMap<Integer,Integer> inventory;
	private List<Drone> drones;
	
	public Warehouse(Point p, HashMap<Integer, Integer> inventory) {
		super();
		this.location = p;
		this.inventory = inventory;
	}



	public Point getLocation() {
		return location;
	}



	public void setLocation(Point location) {
		this.location = location;
	}



	public HashMap<Integer, Integer> getInventory() {
		return inventory;
	}

	public void setInventory(HashMap<Integer, Integer> inventory) {
		this.inventory = inventory;
	}
	
	public List<Drone> getDrones() {
		return drones;
	}


	public void setDrones(List<Drone> drones) {
		this.drones = drones;
	}

}
