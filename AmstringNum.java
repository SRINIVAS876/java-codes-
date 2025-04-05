import java.util.*;
class AmstringNum{
public static void main(String args[]){
int n=1634;  //n=1634,371,35;                            //(    wrong answer    )
 //int revs=0;
int sum=0;
int dup=n;
while(n>0){
int ld=n%10;
sum=sum+(ld*ld*ld);
n=n/10;
//revs=(revs*10)+ld;
}
if(sum==dup){
System.out.println("It is a Amstring number"+sum);
}
else{
System.out.println("It is not a Amstring number"+sum);
}
}
}
