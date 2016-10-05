import java.util.*;
public class ReverseWord{

  public static void main(String args[]){
     Scanner scn=new Scanner(System.in);
     String str=scn.nextLine();
     System.out.println(strfunction(str));
  }
  
  static String strfunction(String str1){
    String[] arr=str1.split(" ");
    StringBuilder sb=new StringBuilder();
    for(int i=arr.length-1;i>0;i--){
      sb.append(arr[i]);
      if(i!=0)
      sb.append(" ");
      }
    return sb.toString();
  }

}
