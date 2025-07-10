package exception;
import java.io.*;
class listofnumbers{
	private int[] list= {1,2,3,4,5};
	public void writelist() {
		PrintWriter out=null;
		try {
			System.out.println("entering try statement");
			out=new PrintWriter(new FileWriter("output.txt"));
			for(int i=0;i<5;i++) {
				System.out.println("value at:"+"="+list[i]);
			}
		}
		catch(Exception e) {
			System.out.println("Exception =>"+e.getMessage());
		}
		finally {
			if(out!=null) {
				System.out.println("closing parameters");
				out.close();
			}
			else {
				System.out.println("PrintWriter not open");
			}
		}
		
	}

}
class Trycatch{
	public static void main(String[] args) {
		listofnumbers list=new listofnumbers();
		list.writelist();
	}
}

