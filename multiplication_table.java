import java.util.*;
public class multiplication_table {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a,b;
		System.out.print("Enter Multiplication table number: ");
		a=scn.nextInt();
		System.out.print("Enter Ending limit: ");
		b=scn.nextInt();
		if(b<1){
		System.out.println("Type a valid limit");	
		}else{
		for(int i=1;i<=b;i++){
			System.out.println(i+"*"+a+"="+(i*a));
		}
	}
		}

}
