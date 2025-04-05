import java.util.*;
class Evenmetla{

public static void mett(int n,int count){
//int count=0;
for(int i=1;i<=5;i++){
if(i%n==0){
count++;
}}
System.out.println( count);

}

public static void main(String args[]){
int count=0;
int n=2;

mett(n,count);
}
}