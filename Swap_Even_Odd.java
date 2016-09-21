package gowdham;
import java.util.*;
public class Swap_Even_Odd {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		StringBuilder sb=new StringBuilder();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i=i+2){
			if(i+1<str.length()){
			sb.append(ch[i+1]);
			sb.append(ch[i]);
			}
			else
				sb.append(ch[i]);
		}
		System.out.println(sb);
	}
}
