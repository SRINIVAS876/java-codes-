import java.util.*;
class Lcm{
public static void main(String ars[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the Frist number: ");
 int num1 = sc.nextInt();
 System.out.print("Enter the Second number: ");
 int num2 = sc.nextInt();
 int lcm=(num1>num2)?num1:num2;
 while(true){
if(lcm%num1==0 && lcm%num2==0){
 System.out.print("The Lcm of "+lcm);
break;
}
++lcm;
}
}
}