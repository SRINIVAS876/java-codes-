import java.util.*;
class LarDigit{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
int lt=0; 
while(a !=0){
int dt= a%10;
if(dt > lt){
lt= dt;
}
a /=10;
}
System.out.println(lt);
//break;
}
}