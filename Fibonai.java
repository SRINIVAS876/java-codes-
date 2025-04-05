import java.util.Scanner;
class Fibonai{
public static void main(String args[]){
Scanner obj= new Scanner(System.in);
int n=obj.nextInt();
int a=0;
int b=1;
int c=0;
for(int i=0; i<=n;i++){
c=a+b;
a=b;
b=c;
System.out.println(c);
}}}