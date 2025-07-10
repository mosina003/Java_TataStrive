package mosina;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		String s=z.next();
		char grade=s.charAt(0);
		
		if(grade=='A') {
			System.out.println("very good");
		}
		else if(grade=='B') {
			System.out.println("good");
		}
		else {
			System.out.println("okay");
		}
	}

}
