import java.util.*;
public class sum_of_arrays {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size=scn.nextInt();
		if(size>0){
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		ArrayList<Integer> arr3=new ArrayList<Integer>();
		
		System.out.println("Enter array1 values ");
		for(int i=0;i<size;i++)
			arr1.add(i,scn.nextInt());
		
		System.out.println("Enter array2 values ");
		for(int i=0;i<size;i++)
			arr2.add(i,scn.nextInt());
		
		for(int i=0;i<size;i++)
		arr3.add(i,arr1.get(i)+arr2.get(i));
		Iterator itr=arr3.iterator();
		System.out.println("The added array is :");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		}
		else{
			System.out.println("Enter a valid array size");
		}
	}
}
