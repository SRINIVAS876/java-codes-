import java.util.*;


class Flower{
 String name;
 String color;
String nopet;
boolean skincare;
public void save(){
System.out.println(this.name);
System.out.println(this.color);
System.out.println(this.nopet);
System.out.println(this.skincare);

}
Flower( String name ,String color ,String nopet ){
this.name=name;
this.color=color;
this.nopet=nopet;
}
Flower(String name, String color,Stringnopet,boolean skincare)
{
this.name=name;
this.color=color;
this.nopet=nopet;
if(skincare==true){

}

}
}
class Fow{
public static void main(String args[]){
Flower obj1=new Flower("rose","red"," 6");

obj1.save();
Flower obj2=new Flower("BWQGY","Yellow","5",ture);
obj2.save();
}}



