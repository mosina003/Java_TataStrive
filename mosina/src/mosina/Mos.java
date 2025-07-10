package mosina;
import java.util.Scanner;

public class Mos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		String s=z.next();
		char grade=s.charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("very good");
			break;
		case 'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("okay");
			break;
		default:
			System.out.println("fail");
			break;
		}
	}

}
