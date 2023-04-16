package beerbottlegame;

public class Umpire {
	int a, b, c, d;

    void remebering_all_the_numbygusser() {
        Guesser g = new Guesser();
        
        a = g.gussernumber();
    }
 
    void remebering_all_the_numbyplayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        b = p1.player1num();
        c = p2.player2num();
        d = p3.player3num();

    }

    void compare_numbers() {

        if (a == b) {
            System.out.println("winner is : p1 ");
        } else if (a == c) {
            System.out.println("winner is : p2");
        } else if (a == d) {
            System.out.println("winner is : p3 ");
        } else {
            System.out.println("retry ! you all loose the game ");
        }
    }

}
