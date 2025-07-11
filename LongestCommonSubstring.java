import java.util.*;
class  LongestCommonSubstring{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int n=s1.length();
int k=s2.length();
int[][] dp=new int[n+1][k+1];
int maxlen=0;
int endIdex=0;
for(int i=1;i<=n;i++){
for(int j=1;j<=k;j++){
if(s1.charAt(i-1)==s2.charAt(j-1)){
dp[i][j]=dp[i-1][j-1]+1;
if(dp[i][j]>maxlen){
maxlen=dp[i][j];
endIdex=i;
}}
else{
dp[i][j]=0;
}}
}
System.out.print(s1.substring(endIdex-maxlen,endIdex));
}}
