package JavaPrograms;

import java.util.Scanner;

public class findCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Count=0;
		System.out.println("Enter String to find the Specific Char:-");
Scanner sc= new Scanner(System.in);
String Ip_String=sc.nextLine();
System.out.println("Enter Char To find in Input String:-");
char Find_Char=sc.nextLine().charAt(0);

for(int i=0;i<=Ip_String.length()-1;i++) {
	
	if(Find_Char==Ip_String.charAt(i)) {
		
		Count++;
	
}

	}
System.out.println("Count  of Char"+Count);

}}
