class Charact{
public static void main(String args[]){
String s="India";
String s1="India@12345";
int count=0;
for(int i=0;i<s.length();i++){
System.out.println(s.charAt(i));
if((s1.charAt(i)>='a' && s1.charAt(i)>='z') || (s1.charAt(i)>='A' && s1.charAt(i)>='Z')){
count++;
}}
System.out.print("String S1 "+count);
}
}