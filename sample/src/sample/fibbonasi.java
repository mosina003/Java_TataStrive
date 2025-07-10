package sample;

public class fibbonasi{
	public static int isfibonacci(int n) {
		if(n<=1)
			return n;
			return isfibonacci(n-1) + isfibonacci(n-2);
	}
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(isfibonacci(i) +" ");
		}
	}

}
