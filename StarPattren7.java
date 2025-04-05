import java.util.*;
class StarPattren7{
    public static void main(String agrs[]){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }     
    }
}