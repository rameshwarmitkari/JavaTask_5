package Task5;

import java.util.Scanner;

public class StringPalin {

	public static void main(String[] args) {
	
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scr.nextLine();
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		if(str1.equals(str)) {
			
			System.out.println("String is palindrom");
		}else
		{
			System.out.println("String is not palindrom");
		}
	}
}
