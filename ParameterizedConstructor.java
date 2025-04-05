class ParameterizedConstructor{
String name;
int id;
ParameterizedConstructor(String name, int id){
this.name=name;
this.id= id;
}
public static void main(String args[]){
ParameterizedConstructor obj=new ParameterizedConstructor("Srinu",6546);
System.out.println(obj.name);
System.out.println(obj.id);
}
}
