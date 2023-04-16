package beerbottlegame;
import java.util.Scanner;
public class Player {
	  int playerenum;

	    int player1num() {
	        System.out.println("player1! guess an number ");
	       Scanner sc = new Scanner(System.in);
	        int playernum = sc.nextInt();
	        return playernum;
	    }

	    int player2num() {
	        System.out.println("player2! guess an number ");
	        Scanner sc = new Scanner(System.in);
	        int playernum = sc.nextInt();
	        return playernum;
	    }

	    int player3num() {
	        System.out.println("player3! guess an number ");
	        Scanner sc = new Scanner(System.in);
	        int playernum = sc.nextInt();
	        return playernum;
	    }

}
