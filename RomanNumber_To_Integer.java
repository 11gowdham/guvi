package gowdham;
import java.util.*;
public class RomanNumber_To_Integer {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str1=scn.next();
		str1.toLowerCase();
		char[] ch=str1.toCharArray();
		int val=ch.length-1;
		int ans=0;
		for(int i=0;i<=val;i++){
			if(ans==9&&ch[i-2]=='i'&&ch[i-1]=='x')
				ans=ans*10;
			if(ch[i]=='i'||ch[i]=='v'||ch[i]=='x'){
				if(val>2){
			if(ch[val-2]=='i'&&ch[val-1]!='i'&&ch[val]=='i'){
				ans=0;
				break;
			}
			}
			if(ch[i]=='v')
				ans=ans+5;
			else if(ch[i]=='x')
				ans=ans+10;
			else if(ch[i]=='i'){
				if(i<val){
					if(ch[i]=='i'&&ch[i+1]!='i')
					ans=ans-1;
					else
					ans=ans+1;
				}
				else
					ans=ans+1;
			}
			}
			else{
				ans=0;
				break;
				}
			System.out.println("ans=>"+ans);
		}
		if(ans>0)
			System.out.print(ans);
		else
			System.out.println("Enter a valid one");
	}
}
