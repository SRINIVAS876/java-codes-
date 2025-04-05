class SortedArray{
    public int search(int[] nums, int target) {
        int n=nums.size();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            if(arr[low]<= arr[mid]){
                if(arr[low]<=target && arr[mid]<=target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
                if(arr[mid]<=target && arr[mid]<=target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}