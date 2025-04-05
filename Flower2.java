class Flower{
String name;
int pet;
String color;
boolean skincare;
public Flower(String name,int pet,String color){
this.name=name;
this.pet=pet;
this.color=color;
}
public Flower(String name,int pet,String color,boolean skincare){
this.name=name;
this.pet=pet;
this.color=color;
this.skincare=skincare;
}
public void display(){
System.out.println("Name:"+this.name);
System.out.println("No of Pet:"+this.pet);
System.out.println("color:"+this.color);
if(this.skincare){
System.out.println("SkinCare=used");
}
else{
System.out.println("SkinCare=notused");
}
}
public static void main(String args[]){

Flower obj1=new Flower("Yellow",66,"Yellow",true);
obj1.display();
Flower obj2=new Flower("Lity",66,"Red");
obj2.display();
}
}

