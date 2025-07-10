package mosina;

class multi{
	public int fact_num(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is "+fact);
		return fact;
	}
}
public class factorial {
	public static void main(String[] args) {
		multi obj=new multi();
		obj.fact_num(5);
	}

}
