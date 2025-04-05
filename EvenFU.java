import java.util.*;
class EvenFU{

public static void mett( int count1,int count2){


Scanner obj=new Scanner(System.in);
System.out.println("ENTER 5 NUMBERS: " );
int arr[]=new int[5];
for(int i=0;i<5;i++){
arr[i]=obj.nextInt();
}

for(int i=0;i<5;i++){
if(arr[i]%2==0){
count1++;
}else{
count2++;
}
}

System.out.println("Np of evens are"+ count1);
System.out.println("Np of odds are"+ count2);


}

public static void main(String args[]){
/*Scanner obj=new Scanner(System.in);
System.out.println("ENTER 5 NUMBERS: " );
int arr[]=new int[5];
for(int i=0;i<5;i++){
arr[i]=obj.nextInt();
}*/

int count1=0;
int count2=0;

mett( count1,count2);
}
}