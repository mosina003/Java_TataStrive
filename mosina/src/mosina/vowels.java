/*package mosina;
import java.util.Scanner;
public class vowels {
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		String s1=z.nextLine();
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		for(int y=0;y<s1.length();y++) {
			if(s1.charAt(y)=='a') {
				a++;
			}
			else if(s1.charAt(y)=='e') {
				e++;
			}
			else if(s1.charAt(y)=='i') {
				i++;
			}
			else if(s1.charAt(y)=='o') {
				o++;
			}
			else if(s1.charAt(y)=='u') {
				u++;
			}
			
		}
		System.out.println("a count:"+a);
		System.out.println("e count:"+e);
		System.out.println("i count:"+i);
		System.out.println("o count:"+o);
		System.out.println("u count:"+u);
		z.close();
	}


}
*/
package mosina;
import java.util.Scanner;
public class vowels {
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		String s1=z.nextLine();
		int a=0,e=0,i=0,u=0,o=0;
		for (int y=0;y<s1.length();y++) {
		switch (s1.charAt(y)){
		case 'a':
			a++;
			break;
		case 'e':
			e++;
			break;
		case 'i':
			i++;
			break;
		case 'o':
			o++;
			break;
		case 'u':
			u++;
			break;
		
		}
		}
System.out.println("a count:"+a);
System.out.println("e count:"+e);
System.out.println("i count:"+i);
System.out.println("o count:"+o);
System.out.println("u count:"+u);
		
		
	}
}
 
