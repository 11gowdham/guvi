import java.util.*;
public class FindHeight {

	    public static void main(String args[]){
	      Scanner scn=new Scanner(System.in);
	      int[] arr={12,56,21,54,32,65,32,95,32,98,23,87,21,65,98,35,98,35,65,39,25,65,95,32,65,32,65,36,65,56,36,28,65,98,98,35,24,54,36,87,57,59,68,57,67,98,67,57,78,25};
        // int[] arr=new int[50];
	      //for(int i=0;i<50;i++)
        //arr[i]=scn.nextInt();
	      for(int i=0;i<arr.length-1;i++)
	    	  for(int j=i+1;j<arr.length;j++)
	    		  if(arr[j]>arr[i]){
	    			  int temp=arr[i];
	    			  arr[i]=arr[j];
	    			  arr[j]=temp;
	    			  }
	      int a=scn.nextInt();
	      if(a>0)
	      System.out.println(arr[a-1]);
	    }
}
}


/*
import java.util.*;
public class FindHeight{

	    public static void main(String args[]){
	    	Scanner scn=new Scanner(System.in);
	      ArrayList<Integer> al=new ArrayList<Integer>();
	      int n=50;
	      
	      for(int i=0;i<n;i++)
	    	  al.add(scn.nextInt());
	      
	      Collections.sort(al);
	      System.out.println(al.get(scn.nextInt()));
	      
	    }
}*/
