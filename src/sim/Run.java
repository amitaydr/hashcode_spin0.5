package sim;

import java.io.FileNotFoundException;

import deliver.Order;
import deliver.Point;
import deliver.Warehouse;
import my_io.Data;
import my_io.Dcommand;
import my_io.InputHandler;
import my_io.LUcommand;
import my_io.OutputHandler;

public class Run {

	public static void main(String[] args) {
		InputHandler h = new InputHandler();
		try {
			h.parseInput(args[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Data data = h.getData();
		OutputHandler out = new OutputHandler();
		int i=0;
		data.orders.forEach((k,o)-> {
			Point oLoc = o.getDestination();
			Warehouse nearest=null;
			int dist = Integer.MAX_VALUE;
			for(Warehouse w : data.wares){
				if (dist > oLoc.distance(w.getLocation())){
					nearest =  w;
					dist = oLoc.distance(w.getLocation());
				}
			}
			o.setNearestWarehouse(nearest);
			if (nearest.getInventory().containsKey(o.getProductList().get(0))){
				Integer next = o.getProductList().keySet().iterator().next();
				out.addCom(new LUcommand(i, 'L',data.wares.indexOf(nearest), next,o.getProductList().get(next) ));
				out.addCom(new Dcommand(i,o.,next.intValue(),o.getProductList().get(next).intValue()));
				i++;
			}
		});	
		
		out.addCom(new LUcommand(1,'L',1,1,1));
		out.toFile("output");
		
		
		
		
	}

}
