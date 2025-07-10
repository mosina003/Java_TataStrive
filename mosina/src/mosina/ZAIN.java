package mosina;

import java.util.Scanner;

public class ZAIN {
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		for(int i=0;i<a;i++) {
			if(i%2==0 && i%5!=0) {
				System.out.println("Welcome to java class");
			}
			else if(i%5==0){
				System.out.println("thank you");
			}
		}
	}

}
