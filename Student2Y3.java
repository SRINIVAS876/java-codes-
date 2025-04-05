class Student2{
static int id=36;      //static  method to access the enter the programm 
String name="Praveen";  // non Static method to create the obj after that only to access it .
String Schoolname="ZHSSchool";
int marks=935;
static int Sumno=73;
public static void main(String args[]){
System.out.println(id);
System.out.println(Sumno);
System.out.println(new Student2().name);
//System.out.println(new Student2().Schoolname);   // nonStatic method gobal variable 
System.out.println(new Student2().marks);
}
public static void test(){
System.out.println(id);
System.out.println(new Student2().Schoolname);
System.out.println(Sumno);
}
}