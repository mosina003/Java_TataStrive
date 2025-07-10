package file_handling;

import java.io.FileWriter;
import java.io.IOException;
public class Writefile {
	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("C:\\Users\\ACT-C5-04\\eclipse-workspace\\mosina\\filename.txt");
			writer.write("java is easy peasy");
			writer.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e) {
			System.out.println("An error occurred");
		}
	}

}
