package my_io;

import java.util.HashMap;
import java.util.List;

import deliver.Drone;
import deliver.Order;
import deliver.Product;
import deliver.Warehouse;

public class Data {
	public List<Warehouse> wares;
	public List<Order> orders;
	public List<Drone> drones;
	public List<Integer> simNumbers; //rows,columns,drones,time,maximumWeight
	public HashMap<Integer,Product> products;
	
	public Data() {	}
}
