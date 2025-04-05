import java.util.*;
class Identity{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("ENTER THR NO. OF ROWS AND COL");
int row=sc.nextInt();
System.out.println("ENTER THE VAL");
int mat[][]=new int[row][row];
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
mat[i][j]=sc.nextInt();
}
}
Boolean is_identity=false;
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){


if(i==j &&mat[i][j]==1){
is_identity=true;
}

else{
if(i!=j && mat[i][j]==0){
is_identity=true;
}
else {
is_identity=false;
}
}

}

}
if(is_identity){
System.out.println("yes");
}else{
System.out.println("NO");
}
}
}