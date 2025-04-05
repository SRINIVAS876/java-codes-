import java.util.*;
class GUD1{
public static void main(String args[]){
int n1,n2;
Scanner sc =new Scanner(System.in);
System.out.print("Eneter the Frist number:");
n1 = sc.nextInt();
System.out.print("Enter the Second number:");
n2 =sc.nextInt();
while(n1!=n2){
if(n1>n2)
n1=n1-n2;
if(n2>n1)
n2=n2-n1;
}
System.out.println("The GCD ="+ n1);
}
}

