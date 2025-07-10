package exception;

public class DivisionByZero {
	public static void main(String[] args) {
		try {
			int divide=5/5;
			System.out.println("Rest of code in try block");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception =>"+e.getMessage());
		}
	}
}
