import java.util.*;
public class IsomorphicString {
	public static void main(String[] args) {	
		String a,b;
		int i,res=1;
		Scanner scn=new Scanner(System.in);
		Map<Character,Character> map=new TreeMap<Character,Character>();
		Map<Character,Character> map1=new TreeMap<Character,Character>();
		a=scn.nextLine();
		b=scn.nextLine();
		if(a.length()!=b.length())
			System.out.println("false");
		else
		{
			char[] ch=a.toCharArray();
			char[] ar=b.toCharArray();
			for(i=0;i<a.length();i++){
				if(map.containsKey(ch[i])){
					if(map.get(ch[i])==ar[i]){
						res=1;
					}
					else{
						res=0;
						//System.out.println(ch[i]+"  false1  "+ar[i]);
					break;
					}}
				else{
					if(map1.containsKey(ar[i])){
						if(map1.get(ar[i])==ch[i]){
							res=1;					
						}
					else{
						res=0;
						//System.out.println("Key is "+ar[i]);
						//System.out.println(ar[i]+" false2 "+ch[i]);
					break;
					}}
					else{
					map.put(ch[i],ar[i]);
					map1.put(ar[i],ch[i]);
					}
				}
			}
			if(res==0)
				System.out.println("false");
			else
				System.out.println("true");
		}
		
	}
}
