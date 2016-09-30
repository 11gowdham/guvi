package prgm;
import java.util.*;
public class pro43 {
	
	static char charac;
	static StringBuilder str=new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		char[] ch=s.toCharArray();
		int b=0,check=0;
		
		for(int i=0;i<ch.length;i++){
			
			if(Character.isDigit(ch[i])){
				b=b*10+Character.getNumericValue(ch[i]);
				
				if(i==ch.length-1 || Character.isAlphabetic(ch[i+1])){
					func(b);
					b=0;
				}
			}
			
			else if(Character.isAlphabetic(ch[i])&&!Character.isAlphabetic(ch[i+1])){
				charac=ch[i];
			}
			
			else{
				System.out.print("Enter proper input");
				check=1;
			}
		}
		
		if(check==0){
			System.out.println(str);
		}
		
	}

	
		static void func(int d){
			for(int i=0;i<d;i++)
				str.append(charac);
		}
	
}
