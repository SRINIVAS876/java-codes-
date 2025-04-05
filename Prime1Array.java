class Prime{
public static void main (String args[]){
int[] arr={1,2,3,4,5,6,7,8,9,11,13};
for(int i=0;i<arr.length;i++){
int count=0;
for(int j=1;j<=arr[i];j++){
if(arr[i]%j==0){
count+=1;
}
}
if(count==2){
System.out.print(arr[i]+" ");
}
}
}
}