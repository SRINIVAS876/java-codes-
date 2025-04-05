import java.util.Scanner;
class EvenOdd{
public static void main(String args[]){   
Scanner obj=new Scanner(System.in);
System.out.print("Eneter a Number: ");
int n=obj.nextInt();
for(int i=1; i<=n;i++){
if(i%2==0){
System.out.println("It is Even Number:" +i);
}
else{
System.out.println("It is a Odde Number:"+i);
}
}
}
}
