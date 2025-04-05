import java.util.*;
class MaxMin{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THR NO. OF ROWS AND COL");
int row=sc.nextInt();
int col=sc.nextInt();

int mat1[][]=new int[row][col];
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;


System.out.println("ENTER THE VAL of mat 1");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
mat1[i][j]=sc.nextInt();
}
}

for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
if(mat1[i][j]>max){
max=mat1[i][j];

}
if(mat1[i][j]<min){
min=mat1[i][j];

}
}}
System.out.println("the max num is:"+max+"  and the min is: "+ min);

}
}