import java.util.*;
public class alphabet {

	public static void main(String[] args) {

char a;
Scanner obj=new Scanner(System.in);

System.out.println("Enter a character: ");

a=obj.next(".").charAt(0); //get a character in 'a'

if(Character.isDigit(a))       //Checking whether it is a number
System.out.println(a+" is a Digit");

else if(Character.isAlphabetic(a))        //Checking whether it a alphabet
	System.out.println(a+" is a Alphabet");

else
	System.out.println("Symbols");
	}

}
