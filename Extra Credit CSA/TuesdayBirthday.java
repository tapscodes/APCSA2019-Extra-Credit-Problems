//Written By Tristan P.-S.
//class to simulate a single tuesday birthday
class TuesdayBirthday {
private int bDay1;
private int bDay2;
private boolean gender1;
private boolean gender2;
private int game;
public TuesdayBirthday(int g){
	game=g+1;
	gender1=setGender();
	gender2=setGender();
	bDay1=setBday();
	bDay2=setBday();
}
public int setBday(){
	return (int)(Math.random()*6);
}
public boolean setGender(){
	if(Math.random() >= .5)
		return true;
	else
		return false;	
}
public int getDay1(){
	return bDay1;
}
public int getDay2(){
	return bDay2;
}
public boolean getGen1(){
	return gender1;
}
public boolean getGen2(){
	return gender2;
}
public String toString(){
	String gen1;
	String gen2;
	if(gender1)
	gen1="M";
	else 
	gen1="F";
	if(gender2)
	gen2="M";
	else 
	gen2="F";
	return "Family "+game+"\nChild 1, Gender:"+gen1+", bDay:"+bDay1+"\nChild 2, Gender:"+gen2+", bDay:"+bDay2+"";
}
}