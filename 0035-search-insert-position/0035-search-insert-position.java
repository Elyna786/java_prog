class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0, end = nums.length-1;
        return bs(nums, target, st, end);
    }

    public int bs(int[] arr, int tar, int st, int end){       
        if(st<=end){
            int mid=st+(end-st)/2;
            if(tar>arr[mid]){
                return bs(arr, tar, mid+1, end);
            } else if(tar<arr[mid]){
                return bs(arr, tar, st, mid-1);
            } else {
                return mid;
            }
        }
        return st;
    }
}