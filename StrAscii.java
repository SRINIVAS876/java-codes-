class StrAscii{
public static void main(String args[]){
String s1="Hellowrold";
String s2="";
int halflength=s1.length()/2;
for(int i=0;i<s1.length();i++){
if(i>=halflength){
s2=s2+(char)(s1.charAt(i)-32);
}
else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
s2=s2+(char)(s1.charAt(i)+32);
}
else{
s2=s2+s1.charAt(i);
}
}
System.out.println(s2);
}
}
	