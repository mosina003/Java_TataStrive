package oops;

@FunctionalInterface
interface FI {
	void SayHello(String name);
}
public class FunctionalInt{
	public static void main(String[] args) {
		FI greet=(name)-> System.out.println("Hello "+name+"!");
		greet.SayHello("mosina");
	}
}
