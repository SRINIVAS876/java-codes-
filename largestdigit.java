import java.util.Scanner;
class LargestNum{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.print("Enter a numbers:");
int n=obj.nextInt();
int largestdigit=0;
while(n!=0){
int digit=n%10;
if(digit>largestdigit){
largestdigit=digit;
}
n/=10;
}
System.out.println("Largest digit:"+largestdigit);
}}
