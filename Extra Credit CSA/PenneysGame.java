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
	game=g+1;
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
	coin1=flip();
	coin2=flip();
	while(!coin1 && !coin2){
		count++;
		coin1=flip();
		coin2=flip();
	}
	return count;
}
//method to simulate how many times until HT
public int flipHT(){
	count=0;
	count++;
	coin1=flip();
	coin2=flip();
	while(!coin1 || coin2){
		count++;
		coin1=flip();
		coin2=flip();
	}
	return count;
}
//method to simulate HH vs HT
public int flipGame1(){
	coin1=flip();
	coin2=flip();
	while(!coin1){
		coin1=flip();
		coin2=flip();
	}
	if(coin2)
		return 1;
	return 2;
}
//method to simulate HTT vs HHT
public int flipGame2(){
	coin1=flip();
	coin2=flip();
	coin3=flip();
	while (!coin1 || coin3){
		coin1=flip();
		coin2=flip();
		coin3=flip();
	}
	if(coin2)
		return 1;
	return 2;
}
//method to simulate HHH vs THH
public int flipGame3(){
	coin1=flip();
	coin2=flip();
	coin3=flip();
	while (!coin2 || !coin3){
		coin1=flip();
		coin2=flip();
		coin3=flip();
	}
	if(coin1)
		return 1;
	return 2;
}
//flips coin1+2
public boolean flip(){
	double flip=Math.random();
	if(Math.random() >= .5)
		return true;
	else
		return false;
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
	return "Test "+game+"\nGame 1: It took "+ht+" until HT occured\nGame 2: It took "+hh+" until HH occured\nGame 3: Player "+winner1+" won\nGame 4: Player "+winner2+" won\nGame 5: Player "+winner3+" won";
}
}