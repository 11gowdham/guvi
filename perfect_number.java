import java.util.*;
public class perfect_number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a=scn.nextInt();
		int i,num=1;
		if(a>3){
			for(i=2;i<a;i++)
			{
				if(a%i==0)
					num=num+i;
			}
			if(num==a)
				System.out.println("It is a perfect number");
			else
				System.out.println("Not a perfect number");
		}
		else
			System.out.println("Not a perfect number");
	}
}
