package prgm;
import java.util.*;
public class NumAndArrayMatch {
	public static void main(String args[]){
		
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[100];
		int size=scn.nextInt();
		
		for(int i=0;i<size;i++)
			arr[i]=scn.nextInt();
		
		for(int i=0;i<size-1;i++){
			
			for(int j=i+1;j<size;j++){
				
				if(arr[j]<arr[i]){
					
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		for(int i=0;i<size;i++){
			
			if(i==arr[i]){
				System.out.println("number "+arr[i]+"equals its index "+i);
			}
		}
	}
}
