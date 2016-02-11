package deliver;


public class Drone {
	final int MAX_WHEIGHT;
	private Point destenation;
	private int timeToDest;
	public Drone(int mAX_WHEIGHT, Point initialLocation, int timeToDest) {
		super();
		MAX_WHEIGHT = mAX_WHEIGHT;
		this.destenation = initialLocation;
		this.timeToDest = timeToDest;
	}
	public Point getDestenation() {
		return destenation;
	}
	public void setDestenation(Point destenation) {
		this.destenation = destenation;
	}
	public int getTimeToDest() {
		return timeToDest;
	}
	public void setTimeToDest(int timeToDest) {
		this.timeToDest = timeToDest;
	}
	public int getMAX_WHEIGHT() {
		return MAX_WHEIGHT;
	}
	
	

}
