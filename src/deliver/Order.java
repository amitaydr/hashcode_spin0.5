package deliver;

import java.util.List;

public class Order {
	private Point destenation;
	private List<Product> productList;
	
	public Order(Point destenation, List<Product> productList) {
		super();
		this.destenation = destenation;
		this.productList = productList;
	}

	public Point getDestenation() {
		return destenation;
	}

	public void setDestenation(Point destenation) {
		this.destenation = destenation;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	

}
