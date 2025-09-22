class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0, end=nums.length-1;
        int ans = bs(nums, target, st, end);
        return ans;        
    }

    public int bs(int[] arr, int tar, int st, int end){
        int mid=st+(end-st)/2;
        if(st<=end){
            

            if(tar>arr[mid]){
                return bs(arr, tar, mid+1, end);
            } else if(tar<arr[mid]){
                return bs(arr, tar, st, mid-1);
            } else {
                return mid;
            }
        }
        return mid;
    }
}