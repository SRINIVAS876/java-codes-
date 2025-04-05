import java.util.*;
class Odd{
    int find_OddEven(){
        Scanner Scan=new Scanner(System.in);
        int n=Scan.nextInt();
        if(n%2==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Odd obj=new Odd();
        int result;
        result=obj.find_OddEven();
        if(result==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}
    