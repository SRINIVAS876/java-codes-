import java.util.*;
class Matmul{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THR NO. OF ROWS AND COL");
int row=sc.nextInt();
int col=sc.nextInt();

int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
int newM[][]=new int[row][col];

System.out.println("ENTER THE VAL of mat 1");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
mat1[i][j]=sc.nextInt();
}
}
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
mat2[i][j]=sc.nextInt();
}
}

int mul=0;
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
for(int k=0;k<row;k++){
newM[i][j]+=mat1[i][k]*mat2[k][j];

}
}
}
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
System.out.print(newM[i][j]+"  ");

}
System.out.println();
}

}
}
