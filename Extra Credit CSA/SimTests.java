//Written By Tristan P.-S.
//class to test all problem classes
import java.util.Scanner;
class SimTests {
	public static void skipLines(){
		System.out.print("\n|\n|\n|\n");
	}
	public static void main(String[] args) {
		int test = 0;
		double avg = 0;
		Scanner s = new Scanner(System.in);
		//BIRTHDAY PROBLEM
		System.out.println("BIRTHDAY PROBLEM SIMULATOR");
		System.out.println("Pick a number of rooms to simulate(INT)");
		int rooms = s.nextInt();
		int people = 0;
		while(test<rooms){
			PartyRoom room = new PartyRoom(test);
			System.out.println(room);
			people += room.getGuests();
			test++;
		}
		avg = (1.0*people)/rooms;
		System.out.print("\nReuslts: Average guests per room:"+avg);
		skipLines();
		
		
		//AIRPLANE PROBLEM
		System.out.println("AIRPLANE PROBLEM SIMULATOR");
		people=0;
		test=0;
		System.out.println("Pick a number of planes to simulate(INT)");
		int planes = s.nextInt();
		while(test<planes){
			AirPlane plane = new AirPlane(test);
			System.out.println(plane);
			people += plane.getCorrect();
			test++;
		}
		System.out.println("\nResults: Out of "+planes+" planes with 100 passangers each, "+people+" got their desitred seat");
		skipLines();
		
		
		//NONTRASITIVE GAME
		System.out.println("NONTRASITIVE GAME SIMULATOR");
		test=0;
		System.out.println("Pick a number of games to simulate(INT)");
		int games = s.nextInt();
		int die=0;
		int ab=0;
		int ac=0;
		int bc=0;
		while(test<games){
			NontransiveGame game = new NontransiveGame(test);
			System.out.println(game);
			if(game.getAB())
			ab++;
			if(game.getAC())
			ac++;
			if(game.getBC())
			bc++;
			test++;
		}
		System.out.println("\nResults: A beat B "+ab+" times, A beat C "+ac+" times, B beat C "+bc+" times out of "+games+" games");
		skipLines();
		
		
		//PENNEYS GAME
		System.out.println("PENNEYS GAME SIMULATOR");
		test=0;
		System.out.println("Pick a number of times to simulate the games and scenarios(INT)");
		games = s.nextInt();
		double hh=0;
		double ht=0;
		int win11=0;
		int win12=0;
		int win13=0;
		while(test<games){
			PenneysGame game = new PenneysGame(test);
			System.out.println(game);
			hh=game.getHH();
			ht=game.getHH();
			if(game.getWin1()==1)
			win11++;
			if(game.getWin2()==1)
			win12++;
			if(game.getWin3()==1)
			win13++;
			test++;
		}
		hh=(int)(hh/games);
		ht=(int)(ht/games);
		System.out.println("\nResults: On average it took "+hh+" for 2 heads in a row and "+ht+" for a heads then tails. For game one, player 1 won "+win11+" games of the first type, "+win12+" of the second type, and "+win13+"of the third type out of "+games+" games.");
		skipLines();
		
		
		//TUESDAY BIRTHDAY PROBLEM
		System.out.println("TUESDAY BIRTHDAY PROBLEM SIMULATOR");
		test=0;
		System.out.println("Pick a number of children to simulate");
		int kids = s.nextInt();
		int oldChildMale=0;
		int oldChildMale2=0;
		int childMale=0;
		int childMale2=0;
		int childMaleTues=0;
		int childMaleTues2=0;
		while(test<kids){
			TuesdayBirthday game = new TuesdayBirthday(test);
			System.out.println(game);	
			//scenario 1
			if(game.getDay1()>game.getDay2()){
				if(game.getGen1()==true){
				oldChildMale++;
				if(game.getGen2()==true)
					oldChildMale2++;	
				}
			}
			//scenario 2
			if(game.getGen1()==true){
				childMale++;
				if(game.getGen2()==true)
					childMale2++;	
			}
			//scenario 3
			if(game.getGen1() && (game.getDay1()==2)){
				childMaleTues++;
				if(game.getGen2()==true)
					childMaleTues2++;	
			}
			else if(game.getGen2() && (game.getDay2()==2)){
				childMaleTues++;
				if(game.getGen1()==true)
					childMaleTues2++;	
			}
			test++;
		}
		System.out.println("\nResults:\nOut of "+kids+" children created, "+childMale+" were/was male, and "+childMale2+" had a male sibling, "+oldChildMale+" were/was the oldest AND male, and "+oldChildMale2+" of them had a male sibling, "+childMaleTues+" were/was born on tuesday AND male, and "+childMaleTues2+" had a male sibling");
		skipLines();
		
		//CANDY PROBLEM
		System.out.println("CANDY PROBLEM SIMULATOR");
		test=0;
		System.out.println("Pick a number of candy eating simulations");
		int sims = s.nextInt();
		int caramels=0;
		while(test<sims){
			Candies game = new Candies(test);
			System.out.println(game);
			if(game.getRes()==false)
			caramels++;
			test++;
		}
		System.out.println("\nResults:\nOut of "+sims+" simulations, the last candy was caramel "+caramels+" times.");
		skipLines();
		
		
		//100 PRISONER PROBLEM
		System.out.println("100 PRISONER PROBLEM SIMULATOR");
		System.out.println("Pick a number of prisons to simulate");
		int prisons = s.nextInt();
		int fullClears=0;
		while(test<prisons){
			Prison game = new Prison(test);
			System.out.println(game);
			if(game.getFC()==true)
			fullClears++;
			test++;
		}
		System.out.println("\nResults:\nOut of "+prisons+" prisons with 100 prisoners, only "+fullClears+" had all 100 prisoners pardoned.");
	}
}