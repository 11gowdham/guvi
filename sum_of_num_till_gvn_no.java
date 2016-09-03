import java.util.*;
class sumofnum{
public static void main(String args[]){
long a,i,sum;
Scanner scn=new Scanner(System.in);
a=scn.nextInt();
if(a>0){
sum=1
for(i=2;i<a;i++)
sum=sum+i;
System.out.println(sum);
}
else 
System.out.println("Enter positive numbers");
}
}
}
