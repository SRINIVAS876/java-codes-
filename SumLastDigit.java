import java.util.*;
class SumLastDigit{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enetre the First number:");
int input =obj.nextInt();
System.out.println("Enter the Second number:");
int input2 =obj.nextInt();
if(input1<0)
input1=(-1)*input1;
if(input2<0)
input2=(-1)*input2;
return (input1%10)+(input2%10);
}
}
