import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		long a,i;
		int b=0;
		Scanner scn=new Scanner(System.in);
		a=scn.nextLong();
		if(a<=1)
		{
			System.out.println("It is not a prime number");
		}
		else if(a==2||a==3)
		{
			System.out.println("It is a prime number");
		}
		else if(a%2==0)
		{
			System.out.println("It is not a prime number");
		}
		else{
		for(i=3;i<a;i=i+2)
		{
			b=1;
			if(a%i==0){
			b++;
			break;
			}
		}
		if(b==1)
			System.out.println("It is a prime number");
		else if(b==2)
			System.out.println("It is not a prime number");
		}
	}

}
