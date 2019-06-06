import java.util.ArrayList;
import javax.print.attribute.*;

//Written By Tristan P.-S.
//class to simulate a single 100 prisoner
class Prison {
private ArrayList<Integer> lockers;
private int game;
private boolean fullClear;
public Prison(int g){
	game=g+1;
	lockers=new ArrayList<Integer>();
	setUpLockers();
	fullClear=openLockers();
}
public void setUpLockers(){
	int ranNum= 0;
	while(lockers.size()<100){
			ranNum=(int)(Math.random()*99);
			lockers.add(ranNum);
		}
}
//simulates the prisoners attempting the strategy
public boolean openLockers(){
	boolean death=true;
	int guess=0;
	for(int i=0;i<100;i++){
		death=true;
		guess=i;
		for(int j=0;j<50;j++){
			if(i==lockers.get(guess))
			death=false;
			else
			guess=lockers.get(guess);
		}
		if(death)
		return false;
	}
	return true;
}
public boolean getFC(){
	return fullClear;
}
public String toString(){
	String occurance;
	if(fullClear)
	occurance="let free";
	else
	occurance="executed";
	return "Prison "+game+": prisoners were "+occurance;
}
}