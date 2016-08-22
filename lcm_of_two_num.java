import java.util.*;
public class lcm_of_two_num {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a,b;
		a=scn.nextInt();
		b=scn.nextInt();
		if(a<0||b<0)
			System.out.println("Enter positive numbers only");
		else if(a>b)
			lcm(a,b);
		else if(a<b)
			lcm(b,a);
		else if(a==b)
			System.out.println("The LCM value is "+a);
	}
	static void lcm(int max,int min){
		for(int i=1;i<=min;i++){
			int x;
			x=max*i;
			if(x%min==0){
				System.out.println("The LCM value is "+x);
				break;
			}
		}
	}
}
