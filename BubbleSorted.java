class BubbleSorted{
public static void main(String args[]){
int arr[]={13,46,24,52,20,9};
for(int i=0;i<arr.length;i++){
int smal=i;
for(int j=0+i;j<arr.length;j++){

if(arr[j]<arr[smal]){
smal=j;
}
}
int temp=arr[smal];
arr[smal]=arr[i];
arr[i]=temp;
}
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
}
}
