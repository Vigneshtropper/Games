package beerbottlegame;
import java.util.Scanner;
public class Guesser {
	int guessnum;

    int gussernumber() {
        System.out.println("gusser!gusser! guess the number ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" tell me secreatly ");
        int guessnum = sc.nextInt();

        return guessnum;
    }

}
