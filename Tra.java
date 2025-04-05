import java.util.*;
class Tra{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THR NO. OF ROWS AND COL");
int row=sc.nextInt();
int col=sc.nextInt();
System.out.println("ENTER THE VAL");
int mat[][]=new int[row][col];
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
mat[i][j]=sc.nextInt();
}
}
for(int j=0;j<row;j++){
for(int i=0;i<col;i++){
System.out.print(mat[i][j]+" ");
}
System.out.println();
}
}
}