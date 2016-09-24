package gowdham;
import java.util.*;
public class Workingday_Holiday {

	public static void main(String[] args) {
		int count=0;
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		s=s.toLowerCase();
		String a[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		for(int i=0;i<7;i++)
		if(s.equals(a[i])){
			System.out.println((!s.equals("sunday")));
			count++;
			break;
			}
		if(count==0)
			System.out.println("Enter a valid day.");
	}
}
