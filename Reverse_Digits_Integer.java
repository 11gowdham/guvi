package gowdham;
import java.util.*;
public class Reverse_Digits_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=0;
		while(a!=0){
			b=b*10;
			b=b+(a%10);
			a=a/10;
		}
		System.out.println(b);
	}
}
