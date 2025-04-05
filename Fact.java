import java.util.*;
class Fact{
public static void main(String args[]){
Scanner obj= new Scanner(System.in);
System.out.println("Enter the num");
int N=obj.nextInt();
int fact=1;
for(int i=1;i<=N;i++){
fact=fact*i;
}
System.out.println("The factorial is:"+fact);
}
}