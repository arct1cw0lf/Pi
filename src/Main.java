import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Pi());

	}

	public static double Pi() {
		Scanner piScan = new Scanner(System.in);
		double denom = 1;
		double pi=0;
		System.out.println("Enter the amount of times you want pi calc to run");
		System.out.println("(The more times, the more accurate...)");
		int piRun = piScan.nextInt();
		for(int i=0;i<piRun;i++) {
			
			
			if (i % 2 == 0) {
	            pi = pi + (1 / denom);
	         } else {
	            pi = pi - (1 / denom);
	         }
			
			denom = denom+2;
		}
		
		pi = pi * 4;
		piScan.close();
		return pi;
		
	}

	
}
