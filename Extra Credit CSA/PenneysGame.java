//Written By Tristan P.-S.
//class to simulate a single set of penny's game
class PenneysGame {
private boolean coin1;
private boolean coin2;
private boolean coin3;
private int count;
private int game;
private int winner1;
private int winner2;
private int winner3;
private int hh;
private int ht;
public PenneysGame(int g){
	game=g;
	hh=flipHH();
	ht=flipHT();
	winner1=flipGame1();
	winner2=flipGame2();
	winner3=flipGame3();
}
//method to simulate how many times until HH
public int flipHH(){
	count=0;
	count++;
	flip(coin1);
	flip(coin2);
	while(!coin1 && !coin2){
		count++;
		flip(coin1);
		flip(coin2);
	}
	return count;
}
//method to simulate how many times until HT
public int flipHT(){
	count=0;
	count++;
	flip(coin1);
	flip(coin2);
	while((coin1 || coin2) && !(coin1 || coin2)){
		count++;
		flip(coin1);
		flip(coin2);
	}
	return count;
}
//method to simulate HH vs HT
public int flipGame1(){
	flip(coin1);
	flip(coin2);
	while(!coin1){
		flip(coin1);
		flip(coin2);
	}
	if(coin2)
		return 1;
	return 2;
}
//method to simulate HTT vs HHT
public int flipGame2(){
	flip(coin1);
	flip(coin2);
	flip(coin3);
	while (!coin1 && coin3){
		flip(coin1);
		flip(coin2);
		flip(coin3);
	}
	if(coin2)
		return 1;
	return 2;
}
//method to simulate HHH vs THH
public int flipGame3(){
	flip(coin1);
	flip(coin2);
	flip(coin3);
	while (!coin2 && !coin3){
		flip(coin1);
		flip(coin2);
		flip(coin3);
	}
	if(coin1)
		return 1;
	return 2;
}
//flips coin1+2
public void flip(boolean coin){
	double flip=Math.random();
	if(Math.random() >= .5)
		coin=true;
	else
		coin=false;
}
//GET METHODS
public int getHT(){
	return ht;
}
public int getHH(){
	return hh;
}
public int getWin1(){
	return winner1;
}
public int getWin2(){
	return winner2;
}
public int getWin3(){
	return winner3;
}
public String toString(){
	return "Test "+game+"\nGame 1: It took "+ht+" until HT occured\nIt took "+hh+" until HH occured\nGame 2: Player "+winner1+"won\nGame 3: Player "+winner2+"won\nGame 4: Player "+winner3+"won";
}
}