import java.util.*;
class SumRow{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THR NO. OF ROWS AND COL");
int row=sc.nextInt();
int col=sc.nextInt();

int sum=0;
int mat1[][]=new int[row][col];
System.out.println("ENTER THE VAL of mat 1");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
mat1[i][j]=sc.nextInt();
}
}

for(int i=0;i<row;i++){
sum=0;
for(int j=0;j<col;j++){
sum=sum+mat1[i][j];
}
System.out.println("the sum of row "+i+ "is "+ sum);
}


for(int j=0;j<row;j++){
sum=0;   
for(int i=0;i<col;i++){
sum=sum+mat1[i][j];
}
System.out.println("the sum of col "+j+ "is "+ sum);
}
}
}