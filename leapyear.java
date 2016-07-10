import java.util.*;
public class leapyear {

	public static void main(String[] args) {
int yr;
Scanner scn = new Scanner(System.in);

System.out.println("Enter a year: ");

yr=scn.nextInt();

if(yr%400==0 && yr%100==0)			//Condition to check leap year
	System.out.println("It is leap year");

else
	System.out.println("It is not a leap year");

	}
}
