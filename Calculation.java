class Calculation{
int z;
public void Addtion(int x, int y){
z=x+y;
System.out.println("The sum of the given numbers:"+z);
}
public void Subtraction(int x, int y){
z=x-y;
System.out.println("The differenc between the given numbers:"+z);
}
}
public class My_Calculation{
public  void Multiplication(int x, int y){
z=x*y;
System.out.println("The Product of  the given numbers:"+z);
}
//public Division(int x, int y){
//z=x/y;
//System.out.println("The  the given numbers:"+z);

public static void maint(String args[]){
int a=20, b=35;
My_Calculation Sp =new My_Calculation();
Sp.Addtion(a,b);
Sp.Subtraction(a ,b);
Sp.Multiplication(a , b);
}
}
