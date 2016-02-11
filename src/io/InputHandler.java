package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import deliver.Drone;
import deliver.Order;
import deliver.Warehouse;
import deliver.Product;

public class InputHandler {
	private List<Warehouse> wares;
	private List<Order> orders;
	private List<Drone> drones;
	private List<Integer> data; //rows,columns,drones,time,maximumWeight
	private HashMap<Integer,Product> products;
	
	public void parseInput(String fileLocation) throws FileNotFoundException {
		try {
			FileReader reader = new FileReader(fileLocation);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = buffer.readLine();
			String[] numbers = line.split(" ");
			for (int i=0 ; i<5 ; i++){
				data.add(i, Integer.parseInt(numbers[i]));
			}
			line = buffer.readLine();
			
			int numProducts = Integer.parseInt(line);
			line = buffer.readLine();
			String[] weights = line.split(" ");
			for (int i=0 ; i<numProducts ; i++){
				products.put(new Integer(i), new Product(i, Integer.parseInt(weights[i])));
			}
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Data getData(){
		
	}
}
