package sim;

import java.io.FileNotFoundException;

import io.Data;
import io.InputHandler;

public class Run {

	public static void main(String[] args) {
		InputHandler h = new InputHandler();
		try {
			h.parseInput(args[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Data data = h.getData();
		
		

	}

}
