package Schlümpfe;

public class Smurf {
	
	public String	name;
	public int		size;

	public Smurf(String name, int size){
		this.name		= name;
		this.size	= size;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
}
