import java.util.*;
public class gcd_hcf {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a,b;
		a=scn.nextInt();
		b=scn.nextInt();
		if((a<0||b<0)){
			System.out.println("Enter positive values");
		}
		else{
		while(a!=b){
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		System.out.println("The GCD or HCF is :"+a);
		}
	}
}
