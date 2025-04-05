import java.util.*;
class Occurence{
public static void main(String[] args){
Scanner obj =new Scanner(System.in);
System.out.println("Enter the no of elements in arrays:");
int n = obj.nextInt();
int[] arr=new int[n];
for(int a=0;a<n;a++){
arr[a]=obj.nextInt();
}
for(int i=0;i<n;i++){
int count=0;
for(int j=0;j<n;j++){
if (arr[i]==arr[j] && i>j){
break;
}
if(arr[i]==arr[j]){
count++;
}
}
if(count>0){
System.out.print(arr[i]+" ");
}
}
}
}
