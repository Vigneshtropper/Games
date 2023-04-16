package beerbottlegame;
import java.util.Scanner;
public class game {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System .out .print("How Many Bottles Are There On The Wall ");
		int x = sc.nextInt();
		int y = 0  ;

		while(x>=0) {
			if( x==0) {System.out.println("No bottle on the Wall");
			    x=x-1;
			    break;
			}
			else if(x==1) {
				System.out.println( x + " bottle  on the wall");
						System.out.println( " take one down " );
						System.out.println(" pass it around ");
						System.out.println("put it on ground ");
						System.out.println(" ");
				   x= x-1;
				}
			
			else {
				System.out .println(x + " bootles  on the wall ");
				System .out .println(" take one down ");
				System .out .println("pass it around");
				System.out.println("put it on ground ");
				System.out.println(" ");
				
				x = x-1;	
			}
			 y = y+1 ;
				System.out.println( y + " Bottles on the ground");
		}
    }
}
