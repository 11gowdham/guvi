import java.util.Scanner;


public class PositiveNegative {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		//Scanner is used to get the input value
		
		long b,c;
		/*In long minimum value is -2,147,483,648 &
		maximum value is 2,147,483,647*/
		
		System.out.println("Type a value");
		
		b=a.nextInt();
		//value is stored in variable b
		
		c = b%2;
		
		if(c==0)
			System.out.println(b+" <- is a Even value");
		else
			System.out.println(b+" <- is a Odd value");


	}

}
