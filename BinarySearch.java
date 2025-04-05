class Binary{
public static int binarysearch(int[] nums, int low,int high,int target){
if(low>high) return -1;
int mid=(low+high)/2;
if(nums [mid]==target) return mid;
else if(target > nums[mid]) 
return binarysearch(nums ,mid+1,high,target);
return binarysearch(nums,low mid-1,target);
}
public static int seach(int[] nums,int target){
return(nums ,0 ,nums.leght-1,return);
}
public static void main(String args[]){
int[] a={1,2,3,4,5,67,7,26,484,427};
int target=67;
int ind=serach(a,target);
if(ind==-1){
System.out.println("The target is not present.");
else{
System.out.println("The target is at index: "+ind);
}}

