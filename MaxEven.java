import java.util.*;
class MaxEven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];

for(int i=0;i<n;i++){
arr[i] =sc.nextInt();
}
int res=findSmallestnumber(arr);
System.out.println(res);

}
public static int findSmallestnumber(int[] arr){
HashSet<Integer>even=new HashSet<>();
for(int num:arr){
if(num%2==0){
even.add(num);
}
}
int maxEven=0;
for(int k:even){
maxEven=Math.max(maxEven,k);
}
for(int i=2;i<=maxEven+2;i+=2){
if(!even.contains(i)){
return i;
}}
return maxEven;
}
}
