class Student{
String name= "Aakash";
int id=106;
int Marks=98;                     // INSTANCES  VARIABLE OR Non static method (gobal variable)   
int Section = 1;
public static void main(String agrs[]){
Student obj=new Student();
System.out.println(obj.name);
System.out.println(obj.id);
System.out.println(obj.Marks);
System.out.println(obj.Section);
}
}