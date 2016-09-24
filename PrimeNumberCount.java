package gowdham;
import java.util.*;
public class PrimeNumberCount {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int count=0;
		if(a>1){
		for(int i=2;i<a;i++){
			if(a%i==0){
				count++;
				System.out.println(i);
			}
		}}
		else
			System.out.println("Enter value greater than 0 only.");
		System.out.println("count =>"+count);
	}

}
