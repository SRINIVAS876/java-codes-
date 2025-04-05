class Prime{
public static void main (String args[]){
int[] arr={1,2,3,4,5,6,7,8,9,11,13};
System.out.println("Prime numbers in the array: ");
for(int i=0;i<arr.length;i++){
boolean isPrime=true;
if(arr[i]<0){
isPrime=false;
}
else{
for(int j=2;j<=Math.sqrt(arr[i]);j++){
if(arr[i]%j==0){
isPrime=false;
break;
}
}
}
System.out.println(isPrime);
}
}
}


