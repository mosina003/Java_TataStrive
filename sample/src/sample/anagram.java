package sample;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static boolean isAnagram(String s1 , String s2) {
		char [] a = s1.toCharArray();
		char [] b = s2.toCharArray();
		 Arrays.sort(a);
		 Arrays.sort(b);
		 return Arrays.equals(a,b);
	}
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String s1 = t.nextLine();
		String s2 = t.nextLine();
		{
		System.out.println(isAnagram(s1 ,s2));
		}
		 
	}

}
