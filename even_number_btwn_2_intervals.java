import java.util.Scanner;
public class even_number_btwn_2_intervals {
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
		if(a%2==0)
			even(a,b);
		else{
			a=a+1;
			even(a,b);
			}
		}
		else if(a==b)
		{
				if(a%2==0)
					even(a,b);
				else
			System.out.println("No even number found");
		}
	}
	static void even(long a,long b){
		for(i=a;a<=b;a=a+2)
		{
			System.out.println(a);
		}
	}
}
