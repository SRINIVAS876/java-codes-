import java.util.*;
class RevArrays{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int[] arr={2,3,4,5,6,7};
int left=0;
int right=arr.length-1;
while(left<right){
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
System.out.print(Arrays.toString(arr));
}
}

