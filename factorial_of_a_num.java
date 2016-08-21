import java.util.*;
public class factorial_of_a_num {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a,i,num=1;
		a=scn.nextInt();
		if(a<0){
			System.out.println("Enter positive values");
		}
		else if(a==1||a==0){
			System.out.println("1");
		}
		else{
			for(i=2;i<=a;i++){
				num=num*i;
			}
			System.out.println(num);
		}
		
	}

}
