//Written By Tristan P.-S.
//class to simulate a single part room in birthday problem
import java.util.ArrayList;
class PartyRoom{
	private ArrayList<Integer> bDays = new ArrayList<Integer>();
	private int roomNum;
	private int guests;
	public PartyRoom(int r){
	roomNum=r+1;
	findGuests();
	}
	public void findGuests(){
		boolean same = false;
		while(!same){
			guests++;
			int bDay=(int)(Math.random()*364);
			bDays.add(bDay);
			if(guests>1)
			for(int i=bDays.size()-2; i>0; i--){
				if(bDay==bDays.get(i))
				same=true;
			}
		}
	}
	public int getGuests(){
		return guests;
	}
	public String toString(){
		return "Room "+roomNum+": Had "+guests+" guests ";
	}
}