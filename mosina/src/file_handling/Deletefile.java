package file_handling;

import java.io.File;
public class Deletefile {
	public static void main(String[] args) {
		File obj=new File("C:\\Users\\ACT-C5-04\\eclipse-workspace\\mosina\\filename.txt");
		if(obj.delete()) {
			System.out.println("deleted file : "+obj.getName());
		}
		else {
			System.out.println("failed to delete the file");  
		}
	}
}
