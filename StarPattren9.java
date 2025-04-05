import java.util.*;
class StarPattren9{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=5;k<(i*2);i++){
                if(k>1 && k<(i*2)-1){
                    System.out.print("");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}