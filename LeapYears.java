
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		try{
		
		int year;
		
		System.out.printf("\nEnter year:::");
		Scanner scnr=new Scanner(System.in);        //Get user Input
		year=scnr.nextInt();
		
		
	if(year%4==0){            //Leap year Calculation
		System.out.println(year+" is a leap year!!");
	}
	else{
		System.out.println(year+" \nis not a leap year!!");
	}
		
		while(year!=0){
		System.out.printf("\nEnter year:::");
		year=scnr.nextInt();
	
	
	if(year%4==0){            //Leap year Calculation
		System.out.println(year+"\n is a leap year!!");
	}
	else{
		System.out.println(year+"is not a leap year!!");
	}
}
		}
	catch(Exception e){
		System.out.printf("\nSomething went wrong , Try again");
	}
	}
}
