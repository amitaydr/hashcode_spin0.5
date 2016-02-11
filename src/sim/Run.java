package sim;

import java.io.FileNotFoundException;

import deliver.Order;
import deliver.Point;
import deliver.Warehouse;
import my_io.Data;
import my_io.InputHandler;

public class Run {

	public static void main(String[] args) {
		InputHandler h = new InputHandler();
		try {
			h.parseInput(args[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Data data = h.getData();
		for (Order o : data.orders){
			Point oLoc = o.getDestenation();
			Warehouse nearest=null;
			int dist = Integer.MAX_VALUE;
			for(Warehouse w : data.wares){
				if (dist > oLoc.distance(w.getLocation())){
					nearest =  w;
					dist = oLoc.distance(w.getLocation());
				}
			}
			o.setNearestWarehouse(nearest);
		
			
		}
		

	}

}
