import java.util.*;
public class PowerOfNumber {

	public static void main(String[] args) {
		
int ans=1,a,b,i;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the base value:");
a=obj.nextInt();
System.out.println("Enter the power value:");
b=obj.nextInt();
if(b==0 || a==1)
	System.out.println(1);
else {
	for(i=1;i<=b;i++)
	ans=a*ans;	
System.out.println("Answer :"+ans);
	}
}
}
