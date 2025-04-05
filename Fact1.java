import java.util.*;
class Fact{
public static void main(String args[]){
int number;
System.out.print("Enter a number: ");
Scanner sc=new Scanner(System.in);
number =sc.nextInt();
int answer=factorial(number);
System.out.println("Factorial of " + number + " is " + answer);    
}
static int factorial(int n){
if(n ==1)
return 1;
return n*factorial(n-1);                                       // 4*factorial(4-1)=3
}                                                                //3*factorial(3-1)=2     //4*3*2*1=24;
}                                                                // 2*factorial(2-1)=1