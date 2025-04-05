import java.util.*;
class Snakemat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int mat1[][]={{1,2,3},{4,5,6},{7,8,23}};
int n=mat1.length;
int m=mat1[0].length;

for(int i=0;i<n;i++){
if(i==0||i%2==0){
for(int j=0;j<m;j++){
System.out.print(mat1[i][j]+" ");
}}
else{
for(int j=0;j<m;j++){

System.out.print(mat1[i][m-1-j]+" ");

}}

}
}
}