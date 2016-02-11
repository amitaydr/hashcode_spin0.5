package deliver;

import java.util.HashMap;

public class Order {
	private Point destination;
	private HashMap<Integer,Integer> productList; //productID, amount
	private Warehouse nearestWarehouse;
	
	public Order(Point destination, HashMap<Integer,Integer> productList) {
		super();
		this.destination = destination;
		this.productList = productList;
	}
	
	public Order(Point destination) {
		super();
		this.destination = destination;
		productList = new HashMap<Integer,Integer>();
	}

	public Point getDestination() {
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
	
	public void add(Integer productID){
		productList.forEach ((k,v)-> {
			if (productID.equals(k)){
				productList.put(k, v+1);
				return;
			}
		});
		productList.put(productID, 1);
	}
	

}
