package mosina;
import java.util.Scanner;

public class palindrome{
	public static Boolean ispalindrome(int n) {
		int ori=n;
		int reverse=0;
		while(n!=0) {
			int m=n%10 ;
			reverse=reverse*10+m;
			n=n/10;
		}
		return ori==reverse;
			
	}
			
			public static void main(String[] args) {
				Scanner t = new Scanner(System.in);
				int n = t.nextInt();
			
				 if(!ispalindrome(n)) {
					System.out.print("not palindrom");
				}
				else {
					System.out.print("palindrome");
				}
			}
			
	

}

	
		

