package oops;
/*
//METHOD OVERRIDING //RUNTIME POLYMORPHISM
interface Animal{
	public void eat();
	public void sound();
	
}
class Dog implements Animal{
	public void eat() {
		System.out.println("The dog eats pedegree");
		
	}
	public void sound() {
		System.out.println("The dog barks");
	}
}
class Cat extends Dog implements Animal{
	public void eat() { //OVERRIDE
		System.out.println("the cat drinks milk");
		super.eat();
	}
	public void sound() { //OVERRIDE
		System.out.println("the cat meowss");
		super.sound();
	}
}
public class Overloading{
	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.eat();
		obj.sound();
	}

}
*/

//METHOD OVERLOADING 
interface A{
	void add(int a,int b);
}
class B implements A{
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("sum:"+c);
	}
}
class C extends B implements A{
	public void add(String a,String b) {
		String c=a+b;
		System.out.println(c);
		
	}
}
public class polymorphism
{
	public static void main(String[] args) {
		C obj=new C();
		obj.add(65,4);
		obj.add("hello","world");	
		}
	
}
