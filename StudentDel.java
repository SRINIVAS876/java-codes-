class Student{
String name;
long phno;
double per10th;
double per12th;
public Student(String name,long phno,double per10th,double per12th){
this.name=name;
this.phno=phno;
this.per10th=per10th;
this.per12th=per12th;
}
public void display(){
System.out.println(this.name);
System.out.println(this.phno);
System.out.println(this.per10th);
System.out.println(this.per12th);
}

public static void main(String args[]){
Student S1=new Student("Mahi",676767,9.4,10);
S1.display();
Student S2=new Student("Srinu",36366,8.8,9.2);
S2.display();
}
}
