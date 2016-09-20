package gowdham;
import java.util.*;
public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		try{
		int a=Integer.parseInt(str);
		System.out.println(a);
		}
		catch (Exception NumberFormatException){
			System.out.println("enter the Integer String alone"); 
		}
	}

}
