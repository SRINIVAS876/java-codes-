import java.util.*;
class Palindram{
public static void main(String args[]){
int n=1032;
int revs=0;
int dup=n;
while(n>0){
int ld=n%10;
revs=(revs*10)+ld;
n=n/10;
}
if(dup==revs){
System.out.println( revs+" true");
}
else{
System.out.println( revs+" false");
}
}
}