import java.util.*;
public class prime_num_btwn_two_num {
static int c;
	public static void main(String[] args) {
		long a,b;
		Scanner scn=new Scanner(System.in);
		a=scn.nextLong();
		b=scn.nextLong();
		if(a<2 && b<2){
			System.out.println("No prime number");
		}
		else{
			if(a>b){
				a=a+b;
				b=a-b;
				a=a-b;
				}
			 if(a<=1){
					a=2;
				}
			if(a==b)
			{
				if(a==2||a==3)
					System.out.println(a);
				else
					prime(a);
			}
			else{
		if(a<b){
			if(a==2){
				System.out.println(a);
				a++;
				System.out.println(a);
				a++;
			}
			prime(a,b);
		}
		else
			System.out.println("No prime number");
			}
		}
	}
	static void prime(long a,long b){
		if(a%2==0){a++;}
		for(long i=a;i<=b;i=i+2){
		int d=0;
			for(long j=3;j<i;j=j+2){
				aa:
				if(i%j==0){
				d++;
				break aa;
				}
			}
			if(d==0)
			System.out.println(i);
		}
		}
	static void prime(long a){
		if(a%2!=0){
		c=0;
		for(long j=3;j<a;j=j+2){
			if(a%j==0){
			c++;
			break;
			}
		}
		if(c==0)
		System.out.println(a);
	}
		else
		{
			System.out.println("No prime number");
		}
	}

}
