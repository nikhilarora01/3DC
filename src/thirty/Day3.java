package thirty;

import java.util.*;

public class Day3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		scan.close();
		String ans = "";

		if (n % 2 == 1) {
			ans = "Weird";
		} 
		if(n%2==0 && n>=2 && n<=5){
			ans="Not Weird";
		}
		if(n%2==0 && n>=6 && n<=20){
			ans="Weird";
		}
		else if(n%2==0 && n>=21){
			ans="Not Weird";
		}
		
		
		System.out.println(ans);
	}

}
