import java.util.*;
public class Solution {
    public static int findMax(int[] v){
        int maxi = Integer.MIN_VALUE;;
        int n=v.length;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,v[i]);
        }
        return maxi;
    }
    public static int func(int[]v ,int har){
        int totalH=0;
        int n=v.length;
        for(int i=0;i<n;i++){
            totalH +=Math.ceil((double)(v[i])/(double)(har));
        }
        return totalH;
    }

    public static int minimumRateToEatBananas(int []v, int h) {
       int low=1,high=findMax(v);
       while(low<=high){
           int mid=(low+high)/2;
           int midH=func(v,mid);
           if(midH<=h){
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }
       return low;
    }
}



