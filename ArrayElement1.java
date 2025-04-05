import java.util.*;
class ArrayElement1{
public static void main(String args[]){
Scanner Scanner =new Scanner(System.in);
System.out.println("Enetr the number of elements in array:"); 
int n= Scanner.nextInt();
int arr[]=new int[n];
System.out.println("Enter"+n+"Element");
for(int i=0;i<n;i++){
arr[i] = Scanner.nextInt();
}
System.out.println("The Array Element are");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
 Scanner.close();
}
}
