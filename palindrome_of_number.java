import java.util.*;
public class palindrome_of_number {

	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		long a,b,c=0;
		//getting input from user
		a=scn.nextLong();
		b=a;
		while(a>0)
		{
			c=c*10;
			c=c+(a%10);
			a=a/10;
		}
		if(c==b)
		System.out.println("Palindrome");
		else
		System.out.println("Not a Palindrome");
	}
}
