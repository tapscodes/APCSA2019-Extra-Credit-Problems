//Written By Tristan P.-S.
//class to simulate a single nontranstive dice game
class NontransiveGame {
	private int gameNum;
	private int aVal;
	private int bVal;
	private int cVal;
	private boolean ab;
	private boolean ac;
	private boolean bc;
	private String match1;
	private String match2;
	private String match3;
	public NontransiveGame(int g){
		gameNum=g+1;
		rollThrice();
	}
	public void rollThrice(){
		int roll1=0;
		int roll2=0;
		int roll3=0;
		roll1= (int)(Math.random()*2);
		roll2= (int)(Math.random()*2);
		roll3= (int)(Math.random()*2);
		diceValues(roll1,roll2,roll3);	
		if(checkWin(aVal, bVal) ){
		ab=true;
		match1="beat";
		}	
		else{ 
		ab=false;
		match1="lost to";
		}
		if(checkWin(aVal, cVal) ){
		ac=true;
		match2="beat";
		}
		else{ 
		ac=false;
		match2="lost to";
		}
		if(checkWin(bVal, cVal) ){
		bc=true;
		match3="beat";
		}
		else{ 
		bc=false;
		match3="lost to";
		}
	}
	public void diceValues(int a, int b, int c){
		if(a==0)
		aVal=2;
		else if(a==1)
		aVal=4;
		else 
		aVal=9;
		if(b==0)
		bVal=1;
		else if(b==1)
		bVal=6;
		else 
		bVal=8;
		if(c==0)
		cVal=3;
		else if(c==1)
		cVal=5;
		else 
		cVal=7;
	}
	public boolean checkWin(int a, int b){
		if(a>b)
		return true;
		return false;
	}
	public Boolean getAB(){
		return ab;
	}
	public Boolean getAC(){
		return ac;
	}
	public Boolean getBC(){
		return bc;
	}	
	public String toString(){
		return "Game "+gameNum+": A "+match1+" B, A "+match2+" C, B "+match3+" C";
	}
}