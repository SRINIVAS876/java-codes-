import java.util.Scanner;
class SumDigit{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int sum=0;
while(n!=0){
sum=sum+n %10;
n/=10;
}
System.out.println("Sum of digits:" +sum);
}}