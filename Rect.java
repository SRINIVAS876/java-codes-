class Rect{
int length;
int breadth;
int rect;
public void save(){
rect=length*breadth;
System.out.println(rect);
}
public static void main(String agrs[]){
Rect obj =new Rect();
obj.length=5;
obj.breadth=10;
obj.save();
}
}