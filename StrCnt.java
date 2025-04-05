class StrCnt{
public static void main(String args[]){
String s="SRINIVAS MAHI SRI $123 143";
int count=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
count++;
}
}
System.out.println(count);
}
}
