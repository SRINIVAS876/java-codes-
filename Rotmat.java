import java.util.*;
class Rotmat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THR NO. OF ROWS AND COL");
int row=sc.nextInt();
int col=sc.nextInt();

int mat1[][]=new int[row][col];
int newM[][]=new int[row][col];

System.out.println("ENTER THE VAL of mat 1");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
mat1[i][j]=sc.nextInt();
}
}


for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
  newM[i][j]=mat1[j][i];

}
//int n=mat1.length;
}for(int i=0;i<row;i++){
for(int j=0;j<=col/2;j++){
int temp=newM[i][j];
newM[i][j]=newM[i][col-1-j];
newM[i][col-1-j]=temp;



}}
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
System.out.print(newM[i][j]+"  ");

}
System.out.println();
}

}
}
