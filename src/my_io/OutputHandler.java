package my_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OutputHandler {
	private List<Command> commands;
	
	public OutputHandler() {
		commands = new ArrayList<Command>();
	}
	
	public void toFile(String fileName){
		try{
			File file = new File(fileName+".txt");
			FileWriter writer = new FileWriter(file);
			writer.write(commands.size() + "\n");
			for (Command c : commands){
				writer.write(c.toString() + "\n");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addCom(Command c){
		commands.add(c);
	}
}
