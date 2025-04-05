import java.util.Scanner;
class Sum{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int sum=0;
while(n!=0){
sum +=n%10;
n/=10;
}
System.out.println("Sum of Number:"+sum);
}}

