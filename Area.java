class Area{
int radius;
double pi=3.14;
double Area;
public void save(){
Area =pi*(radius*radius);
System.out.println(Area);
}
public static void main(String args[]){
Area obj=new Area();
obj.radius=5;
obj.save();
}
}