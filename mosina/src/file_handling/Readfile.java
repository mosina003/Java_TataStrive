package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
	public static void main(String[] args) {
		try {
			File obj = new File("C:\\Users\\ACT-C5-04\\eclipse-workspace\\mosina\\filename.txt");  // Ensure this file exists in the correct directory
			Scanner Reader = new Scanner(obj);

			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}

			Reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}
}
