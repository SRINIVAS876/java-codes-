import java.util.*;
class StarPattren6{
    public static void main(String agrs[]){
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println( );
        }
        for(int a=1;a<=5;a++){
            for(int b=1;b<=a;b++){
                System.out.print(" ");
            }
            for(int c=5;c>=a;c--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}