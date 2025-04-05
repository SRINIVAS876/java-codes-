import java.util.*;
class StarPattren4{
    public static void main(String agrs[]){
            for (int i=1;i<=5;i++){
                for(int j=4;j>=i;j--){
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println( );
        }
    } 
}

