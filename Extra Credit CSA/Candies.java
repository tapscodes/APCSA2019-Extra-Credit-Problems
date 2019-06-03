//Written By Tristan P.-S.
//class to simulate a single candy problem
class Candies {
private int caramels;
private int mints;
private boolean result;
private int game;
public Candies(int g){
	game=g;
	caramels=123;
	mints=321;
	result=eat();
}
public boolean eat(){
	while(mints>0 && caramels>0){
	int candy=(int)(Math.random()*443);
	if(candy<=123)
	caramels--;
	else 
	mints--;
	}
	if(caramels==0){
		return true;//mint
	}
	return false;//caramel
}
public boolean getRes(){
	return result;
}
public String toString(){
	String candy;
	if(result)
	candy="mint";
	else
	candy="caramel";
	return "Test "+game+": "+candy+" was last";
}
}