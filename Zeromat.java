import java.util.*;
class Zeromat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int mat1[][]={{1,2,3,4},{4,0,6,13},{7,8,0,5},{2,3,5,6}};
int n=mat1.length;
int m=mat1[0].length;
int mat2[][]=new int [n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
mat2[i][j]=mat1[i][j];
}
}

for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
  
if(mat1[i][j]==0){
  for(int k=0; k<m; k++){  
  mat2[i][k]=0;
  mat2[k][j]=0;
   }  
break;
}


}
}

for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
System.out.print(mat2[i][j]+" ");
}
System.out.println();
}
}}