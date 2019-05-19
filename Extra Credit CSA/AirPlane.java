//Written By Tristan P.-S.
//class to simulate a single plane in plane problem
class AirPlane {
	private int passengers;
	private int planeNum;
	private int happyPassengers;
	public AirPlane(int plane){
		planeNum=plane+1;
		passengers=0;
		findHappy();
	}
	public void findHappy(){
		while(passengers<100){
			int seat=(int)(Math.random()*99);
			if(passengers==seat)
			happyPassengers++;
			passengers++;
		}
	}
	public int getCorrect(){
		return happyPassengers;
	}
	public String toString(){
		return "Plane "+planeNum+": Had "+happyPassengers+" happy passengers out of 100";
	}
}