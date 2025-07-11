import java.util.*;
class Power{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int base= sc.nextInt();
int exp=3;
int res=1,i=1;
do{
res =res*base;
i++; 
}
while(i<=exp);
System.out.println("Results " +  res);
}
}
