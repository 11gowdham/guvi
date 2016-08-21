import java.util.*;
public class armstrong_num {

	public static void main(String[] args) {
		String s;
		int a,b;
		double i=0;
		Scanner scn=new Scanner(System.in);
		b=a=scn.nextInt();
		if(a<0){
			System.out.println("Pls enter a positive number");
		}
		else{
		s=Integer.toString(a);
		while(a!=0){
			i=i+Math.pow(a%10,s.length());
			a=a/10;
		}
		if((int)i==b)
			System.out.println("It is Amstrong number");
		else
			System.out.println("It is Not a Amstrong number");
		}
	}

}
