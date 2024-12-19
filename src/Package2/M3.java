package Package2;

import java.util.Scanner;

public class M3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=	sc.next();
		String org=str;
		String rev="";
		int k=	str.length();
		for (int i = k-1; i >=0; i--) {
			rev=rev+str.charAt(i);

		}
		if (org==rev) {
			System.out.println("Palindrome string   "+org);

		} else {
			System.out.println("Not a Palindrome string   "+org);

		}

	}

}
;