package oops;
// SINGLE LEVEL INHERITANCE
/*class Principle{
	public void permission() {
		System.out.println("Permission granted");
	}
}
class student extends Principle{
	public void need_permission() {
		System.out.println("please give permission for IV");
	}
}
public class inheritance {
	public static void main(String[] args) {
		student obj=new student();
		obj.need_permission();
		obj.permission();
	}

}
*/
//MULTI LEVEL INHERITANCE
/*class Principle{
	public void circular() {
		System.out.println("the exam is scheduled from june");
	}
}
class HOD extends Principle{
	protected void exam_cell() {
		System.out.println("Question paper set A should be distributed");
	}
	
}
class Rahulsir extends HOD{
	public void message(){
		System.out.println("Students be ready for the exams, Question paper set A will be coming");
	}
}
public class inheritance{
	public static void main(String[] args) {
		Rahulsir obj =new Rahulsir();
		obj.circular();
		obj.message();
		
	}	
}
*/

//HIERARCHICAL INHERITANCE
class Principle{
	private String order="Study";
	protected String name="srinivasan";
}
class HOD extends Principle{
	protected void circular() {
		System.out.println("mini project expo");
	}
}
class Student extends Principle{
	public void permission() {
		System.out.print("we need IV to NASA ");
	}
}
public class inheritance{
	public static void main(String[] args) {
		Student obj=new Student();
		obj.permission();
		System.out.print("Mr "+obj.name);
	}
}

