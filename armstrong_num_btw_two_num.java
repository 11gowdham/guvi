import java.util.*;

public class armstrong_num_btw_two_num {

	public static void main(String[] args) {
		int a,b,c;
		double d=0;
		Scanner scn=new Scanner(System.in);
		a=scn.nextInt();
		b=scn.nextInt();
				if(a>b){
					a=a+b;
					b=a-b;
					a=a-b;
				}
				
				for(int i=a;i<=b;i++){
					d=0;
					c=i;
					String s=Integer.toString(c);
				
				while(c!=0){
				d=d+Math.pow(c%10,s.length());
				c=c/10;
				}
				
				if(i==(int)d)
						System.out.println((int)d+" is armstrong number");
				}	
	}
}
