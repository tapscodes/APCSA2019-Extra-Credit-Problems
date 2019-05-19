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
		
		skipLines();
		
		
		//TUESDAY BIRTHDAY PROBLEM
		System.out.println("TUESDAY BIRTHDAY PROBLEM SIMULATOR");
		skipLines();
		
		
		//CANDY PROBLEM
		System.out.println("CANDY PROBLEM SIMULATOR");
		skipLines();
		
		
		//100 PRISONER PROBLEM
		System.out.println("100 PRISONER PROBLEM SIMULATOR");
	}
}