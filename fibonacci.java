import java.util.*;
public class fibonacci {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a=0,b=1,c,d;
		d=scn.nextInt();
		if(d<1){
			System.out.println("Enter a valid number");
		}
		else{
			System.out.print(a+","+b);
			for(int i=1;i<d;i++){
				c=a;
				a=b;
				b=a+c;
				
				System.out.print(","+b);
		}
			System.out.print(".");
		}
	}

}
