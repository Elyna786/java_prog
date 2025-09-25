class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=0, end= nums.length-1;
        int[] ans = bs(nums, target, st, end);
        return ans;
    }

    public int[] bs(int[] arr, int tar, int st, int end){
        if(st<=end){
            int mid=st+(end-st)/2;
            if(tar>arr[mid]){
                return bs(arr, tar, mid+1, end);
            } else if(tar < arr[mid]){
                return bs(arr, tar, st, mid-1);
            } else{
                int left=mid, right=mid;
                while(left>st && arr[left-1]==tar){
                    left--;
                }
                while(right<end && arr[right+1]==tar){
                    right++;
                }
                return new int[] {left, right};
            }
        }
        return new int[] {-1, -1};
    }
}