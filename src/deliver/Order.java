package deliver;

import java.util.HashMap;
import java.util.List;

public class Order {
	private Point destination;
	private HashMap<Integer,Integer> productList; //productID, amount
	private Warehouse nearestWarehouse;
	
	public Order(Point destination, HashMap<Integer,Integer> productList) {
		super();
		this.destination = destination;
		this.productList = productList;
	}

	public Point getDestenation() {
		return destination;
	}

	public void setDestenation(Point destenation) {
		this.destination = destenation;
	}

	public HashMap<Integer,Integer> getProductList() {
		return productList;
	}



	public Warehouse getNearestWarehouse() {
		return nearestWarehouse;
	}

	public void setNearestWarehouse(Warehouse nearestWarehouse) {
		this.nearestWarehouse = nearestWarehouse;
	}
	
	public void add(int productID){
		if productList.containsKey(productID){
	}
	

}
