import java.util.*;
public class odd_number_btwn_2_intervals {
static long i;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long a,b;
		a=scn.nextLong();
		b=scn.nextLong();
		if(a>b){
			a=a+b;
			b=a-b;
			a=a-b;
		}
		if(a<b){
		if(a%2!=0)
			odd(a,b);
		else{
			a=a+1;
			odd(a,b);
			}
		}
		else if(a==b)
		{
				if(a%2!=0)
					odd(a,b);
				else
			System.out.println("No odd number found");
		}
	}
	static void odd(long a,long b){
		for(i=a;a<=b;a=a+2)
		{
			System.out.println(a);
		}
	}
}
