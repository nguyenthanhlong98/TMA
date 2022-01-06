package TestTMA;

import java.util.Scanner;

public class TestPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you String: ");
		String str = sc.next();
		String org_str = str;

		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println(org_str + " is Palindrome String");
		} else {
			System.out.println(org_str + " is not Palindrome String");
		}

	}
}
