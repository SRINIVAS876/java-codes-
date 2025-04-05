import java.util.*;
class Digsum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0;
int sum2=0;
System.out.println("ENTER THR NO. OF ROWS AND COL");
int row=sc.nextInt();
System.out.println("ENTER THE VAL");
int mat[][]=new int[row][row];
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
mat[i][j]=sc.nextInt();
}
}
for(int i=0;i<row;i++){


sum+=mat[i][i];
sum2+=mat[i][row-1-i];


}
System.out.println("Primary diagnal "+sum);
System.out.println("Secondary diagnal "+sum2);
}

}