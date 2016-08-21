import java.util.*;
public class count_words_in_line {

	public static void main(String[] args) {
		String s;
		Scanner scn=new Scanner(System.in);
		s=scn.nextLine();
		String a[]=s.split(" ");
		if(s.equals("")||a.length==0){
			System.out.println("Empty line");
		}else{
		System.out.println(a.length+" words were there in this line");
		}
	}

}
