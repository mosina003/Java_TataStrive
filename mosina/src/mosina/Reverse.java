package mosina;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=z.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
