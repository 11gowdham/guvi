package gowdham;
import java.util.Scanner;

public class Factorial_of_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
int b=1;
for(int i=1;i<=a;i++)
	b=b*i;
System.out.println(b);
	}

}
