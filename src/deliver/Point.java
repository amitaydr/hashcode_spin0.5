package deliver;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
	
	public int distance (Point other){
		if (other==null)return -1;
		return (int)Math.ceil(Math.sqrt(Math.pow((this.x-other.x),2)+Math.pow((this.y-other.y),2)));
		
	}

}
