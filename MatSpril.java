import java.util.*;
class MatSpril{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int mat1[][]={{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};

int row=mat1.length;
int col=mat1[0].length;
int start=0,end=col-1;
int top=0, bot=row-1;
while(start<end){

for(int j=start; j<=end; j++){ 
System.out.print(mat1[top][j]+" ");
}top++;
for(int i=top; i<=bot; i++){ 
System.out.print(mat1[i][end]+" ");
}end--;

for(int j=end; j>=start; j--){ 
System.out.print(mat1[bot][j]+" ");
}bot--;
for(int i=bot; i>=top; i--){ 
System.out.print(mat1[i][start]+" ");
}start++;
}

}}
