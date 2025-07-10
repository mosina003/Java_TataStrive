package sample;
import java .util.Scanner;
public class greatest {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int a = t.nextInt();
		
		int b = t.nextInt();
		
		int c = t.nextInt();
		
		if((a>=b) && (a>=c)) {
			System.out.println("A " +a);
		}
		else if((b>=a) && (b>=c)) {
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
	}

}
