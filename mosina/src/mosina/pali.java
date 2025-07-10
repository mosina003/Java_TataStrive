/*package mosina;
import java.util.Scanner;

public class pali{
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		String n=z.nextLine();
		String ori=n;
		String dup="";
		for(int i=n.length()-1;i>=0;i--) {
			dup+=n.charAt(i);
		}
		
		if(ori==dup) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
	}
	
}
*/
package mosina;
import java.util.Scanner;

public class pali{
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		String n=z.nextLine();
		int i=0;
		int y=n.length()-1;
		while(i<y) {
			if(n.charAt(i)!=n.charAt(y)) {
				System.out.println("not palindrome");
				return;
			}
			i++;
			y++;
		}
		System.out.print("palindrome");
	}
		}
		
		
		
		