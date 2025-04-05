class AlphabetsDigitSpecialCh{
public static void main(String args[]){
String s1="India@$13242";
int cunt1=0,cunt2=0,cunt3=0;
for(int i=0;i<s1.length();i++){
if((s1.charAt(i)>='a' && s1.charAt(i)<='z') || (s1.charAt(i)>='A' && s1.charAt(i)<='Z')){
cunt1++;
}
else if(s1.charAt(i)>='1' && s1.charAt(i)<='9'){
cunt2++;
}
else{
cunt3++;
}
}
System.out.println("Alphabets "+cunt1);
System.out.println( "SpecialChar "+cunt3);                                 
System.out.println("Digits "+cunt2);
}
}