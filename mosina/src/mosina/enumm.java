package mosina;
import java.util.*;
enum Classes{
	FIRSTCLASS,
	SECONDCLASS,
	THIRDCLASS
}
public class enumm {
	public static void main(String[] args) {
		Classes obj=Classes.FIRSTCLASS;
		System.out.println(obj);
		for(Classes c : Classes.values()) {
			System.out.println(c);
			
		}
		Scanner z=new Scanner(System.in);
		String classy = z.nextLine();
		switch (classy) {
		case "FIRSTCLASS":
			System.out.println("passed in first class");
			break;
		case "SECONDCLASS":
			System.out.println("passed in second class");
			break;
		case "THIRDCLASS":
			System.out.println("Just passed");
			break;
		}
		
	} 

}
