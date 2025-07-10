package mosina;
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		int fahrenheit=z.nextInt();
		double celcius=(fahrenheit-32)*(5.0/9);
		System.out.println("the degree in celcius is : "+celcius);
	}

}
