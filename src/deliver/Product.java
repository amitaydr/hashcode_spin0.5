package deliver;

public class Product {
	private int id;
	private int wheight;
	
	public Product(int id, int wheight) {
		this.id = id;
		this.wheight = wheight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWheight() {
		return wheight;
	}

	public void setWheight(int wheight) {
		this.wheight = wheight;
	}
	
	public boolean equals (Product other){
		return (this.id == other.id);
	}

}
