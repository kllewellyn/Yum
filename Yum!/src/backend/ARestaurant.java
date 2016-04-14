package backend;

import java.util.LinkedList;

public class ARestaurant {
	LinkedList<Party> PartyList;
	String Name;
	int occupancy;
	
	
	public ARestaurant (String NameIn, int occupancyIn){
		Name=NameIn;
		occupancy=occupancyIn;
		PartyList= new LinkedList<Party>();
	}
	
	public void addParty(Party P){
		PartyList.add(P);
	}
	
	public void removeParty(Party P){
		PartyList.remove(P);
	}
	
	public LinkedList<Party> getQueue(){
		return PartyList;
	}
}
