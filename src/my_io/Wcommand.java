package my_io;

public class Wcommand extends Command {
	private int id;
	private int turns;
	
	public Wcommand(int id, int turns) {
		this.id = id;
		this.turns = turns;
	}
	
	@Override
	public String toString(){
		return id + " W " + turns;
	}
	
}
