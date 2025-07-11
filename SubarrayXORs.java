import java.util.*;
class SubarrayXORs{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int[] arr={1,2};
int k=arr.length;
int res=0;
for(int i=0;i<k;i++){
int cunt=(i+1)*(k-i);
if(cunt%2 !=0){
res ^=arr[i];
}
}
System.out.print(res);
}
}