package mosina;

public class diamond {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			for(int j=0;j<(2*i)+1;j++) {
				System.out.print("2");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");	
			}
			System.out.println();
			
		}
		
	}

}
