import java.util.*;
class Secondsmallest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<2){
System.out.println("Atleast two elements are requied ");
return;
}
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int min = Integer.MAX_VALUE;
int sd = Integer.MAX_VALUE;
for(int num:arr){
if(num<min){
sd=min;
min=num;
}
else if(num>min && num<sd){
sd=num;
}
}
if(sd == Integer.MAX_VALUE){
System.out.println("All elements are same");
}
else{
System.out.println(sd);
}
}
}
