package backend;

public class AParty implements Party {
	private int size;
	private String name;
	private String number;
	
	public AParty(String nameIn, int sizeIn, String numberIn){
		size=sizeIn;
		name=nameIn;
		number=numberIn;
	}
	
	public String getName(){
		return name;
	}
	
	public String getNumber(){
		return number;
	}
	
	public int getSize(){
		return size;
	}
	
}
