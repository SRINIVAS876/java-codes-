import java.util.*;
class Sum2{
public static void main(String args[]){
Scanner obj= new Scanner(System.in);
System.out.println("Enter the num");
int N=obj.nextInt();
int sum=0;
for(int i=1;i<=N;i++){
sum=sum+i;
}
System.out.println("The sum is:"+ sum);
}
}