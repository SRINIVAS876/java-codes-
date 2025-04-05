class Cal{
int z;
public void add(int x, int y){
z=x+y;
System.out.println(z);
}
public void sub(int x, int y){
z=x-y;
System.out.println(z);
}
public void mul(int x, int y){
z=x*y;
System.out.println(z);
}
public static void main(String args[]){
int a=26,b=6;
Cal Sp=new Cal();
Sp.add(a,b);
Sp.sub(a,b);
Sp.mul(a,b);
}
}