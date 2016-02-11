package my_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import deliver.Drone;
import deliver.Order;
import deliver.Point;
import deliver.Warehouse;
import deliver.Product;

public class InputHandler {
	private Data data;
	
	public InputHandler() {
		data = new Data();
	}
	
	public void parseInput(String fileLocation) throws FileNotFoundException {
		try {
			FileReader reader = new FileReader(fileLocation);
			BufferedReader buffer = new BufferedReader(reader);
			final String delim = " "; 
			
			//global parameters
			String line = buffer.readLine();
			String[] numbers = line.split(delim);
			for (int i=0 ; i<5 ; i++){
				data.simNumbers.add(i, Integer.parseInt(numbers[i]));
			}
			
			//all products
			line = buffer.readLine();
			int numProducts = Integer.parseInt(line);
			line = buffer.readLine();
			String[] weights = line.split(delim);
			for (int i=0 ; i<numProducts ; i++){
				data.products.put(new Integer(i), new Product(i, Integer.parseInt(weights[i])));
			}
			
			//warehouses
			line = buffer.readLine();
			int numWares = Integer.parseInt(line);
			String[] xy;
			String[] quants;
			Point p;
			HashMap<Product, Integer> inventory;
			for (int i=0 ; i<numWares ; i++){
				inventory = new HashMap<Product, Integer>();
				line = buffer.readLine();
				xy = line.split(delim);
				p = new Point(Integer.parseInt(xy[0]), Integer.parseInt(xy[1]));
				line = buffer.readLine();
				quants = line.split(delim);
				for (int j=0 ; j<quants.length ; j++){
					inventory.put(data.products.get(j), Integer.parseInt(quants[j]));
				}
				data.wares.add(i, new Warehouse(p, inventory));
			}
			
			//orders
			line = buffer.readLine();
			int numOrders = Integer.parseInt(line);
			int productsInOrder;
			String[] prods;
			Order order;
			for (int i=0 ; i<numOrders ; i++){
				line = buffer.readLine();
				xy = line.split(delim);
				p = new Point(Integer.parseInt(xy[0]), Integer.parseInt(xy[1]));
				line = buffer.readLine();
				productsInOrder = Integer.parseInt(line);
				line = buffer.readLine();
				prods = line.split(delim);
				order = new Order(p);
				for (int j=0 ; j<productsInOrder ; j++){
					order.add(Integer.parseInt(prods[i]));
				}
				data.orders.add(i, order);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public Data getData(){
		return data;
	}
}
