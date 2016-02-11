package my_io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import deliver.Drone;
import deliver.Order;
import deliver.Product;
import deliver.Warehouse;

public class Data {
	public List<Warehouse> wares = new ArrayList<Warehouse>();
	public HashMap<Integer,Order> orders = new HashMap<Integer,Order>() ;
	public List<Drone> drones = new ArrayList<Drone>();
	public List<Integer> simNumbers = new ArrayList<Integer>(); //rows,columns,drones,time,maximumWeight
	public HashMap<Integer,Product> products = new HashMap<Integer,Product>();
	
	public Data() {	}
}
