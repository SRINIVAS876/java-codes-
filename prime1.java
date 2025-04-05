import java.util.*;
class Prime1{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int primecount=0;
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
                if(count==2){
                    primecount++;
                }
            }
            System.out.println(primecount);
        }
    }
