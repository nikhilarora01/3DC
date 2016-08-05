package thirty;
import java.io.*;
import java.util.*;


public class DayOne {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int j = scan.nextInt();

		double e = scan.nextDouble();
		
		String q = scan.nextLine();

		System.out.println(j + i);
		System.out.println(d + e);
		System.out.println(s+ " " +q);

		
		scan.close();

	}
}