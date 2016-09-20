package gowdham;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		/*Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();*/
		String str="Google is the best";
		StringBuffer str1=new StringBuffer();
		char[] a=str.toCharArray();
		for(int i=a.length-1;i>=0;i--){
		//	System.out.print(a[i]);
			str1=str1.append(a[i]);
		}
		System.out.println("Output is "+str1);
	}
}
