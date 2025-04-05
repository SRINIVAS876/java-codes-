import java.util.Scanner;
class Forloop{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
for(int i=0;i<5;i++){
for(int j=0;j<5-i;j++){
System.out.println(" ");
}
for(int j=0;j<5-i;j++){
System.out.print("* ");
}
System.out.println();
}}
}