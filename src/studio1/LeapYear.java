package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("year");
		int year = in.nextInt();
		
		boolean LeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		// TODO Auto-generated method stub

	}

}
