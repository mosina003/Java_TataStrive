package file_handling;

import java.io.File;
import java.io.IOException;

public class Createfile {
	public static void main(String[] args) {
		try {
			File obj=new File("filename.txt");
			if(obj.createNewFile()) {
				System.out.println("file created:"+obj.getName());	
			}
			else {
				System.out.println("file already exist");
			}
		}
		catch(IOException e){
			System.out.println("ana error occurred");
			e.printStackTrace();
			
		}
	}

}
