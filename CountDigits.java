import java.util.*;
public class CountDigits {

	public static void main(String[] args) {

long i,a,sum=0;
Scanner scn=new Scanner(System.in);
a=scn.nextLong();
while(a>0)
{
i=a%10;
sum=sum+i;
a=a/10;
}
System.out.println(sum);
	}

}
