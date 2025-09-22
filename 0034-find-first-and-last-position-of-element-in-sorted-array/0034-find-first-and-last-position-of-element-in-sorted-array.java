class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int st=0, end=nums.length-1;
        int[] ans = bs(nums, target, st, end);
        return ans;
    }

    public int[] bs(int[] nums, int target, int st, int end){
        if(st<=end){
            int mid = st+(end-st)/2;

            if (target < nums[mid]){
                return bs(nums, target, st, mid-1);
            } else if(target > nums[mid]){
                return bs(nums, target, mid+1, end);
            } else {
                int left=mid, right =mid;
                while(left > st && nums[left-1] == target){
                    left--;
                }
                while(right < end && nums[right+1] == target){
                    right++;
                }
                return new int[] {left, right};
            }
        }

        return new int[] {-1, -1};
    }
}