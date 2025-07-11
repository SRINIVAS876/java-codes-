import java.util.*;
class SumDit{
public static void main(String args[]){
int sum=0;
int n=1255;

while(n>0){
 sum +=n%10;
 n /=10;
}
System.out.println(sum);

}
}