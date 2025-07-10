package oops;
import java.util.*;
//MULTIPLE INHERITANCE
/*
interface M{
	public void name();
	
}
interface O{
	public int age();
}
interface S{
	abstract void degree();
}
class I implements M,O,S{
	public void name() {
		System.out.println("My name is thendral");
	}
	public int age() {
		System.out.println(20);
		return 20;
	}
	public void degree() {
		System.out.println("AI&DS");
	}
}
public class interfaces {
	public static void main(String[] args) {
		I obj = new I();
		obj.name();
		obj.age();
		obj.degree();
	}

}
*/


//HYBRID INHERITANCE
interface M{
	void add(int a,int b);
}
class O implements M{
	public void add(int a,int b) {
		int c;
		c=a+b;
		System.out.println("sum:"+c);
		
	}
	void sub() {
		System.out.println("subtraction");
	}
}
class S implements M{
	public void add(int a,int b) {
		System.out.println("add");
	}
	void mul(int a,int b) {
		System.out.println(a*b);
	}
}
interface I extends M{
	void power(int c,int d);
}

class N extends S implements I{
	public void power(int c,int d){
		int e=(int)Math.pow(c,d);
		System.out.println(e);
	}
}
public class interfaces{
	public static void main(String[] args) {
		N obj=new N();
		obj.add(4,5);
		obj.mul(4,5);
		obj.power(2, 4);
	}
}







