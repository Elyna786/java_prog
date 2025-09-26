class Solution {
    public int singleNonDuplicate(int[] nums) {
        int st=0, end=nums.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if((mid & 1) == 0){
                if(nums[mid]==nums[mid+1]){
                    st = mid+2;
                } else {
                    end = mid;
                }
            } else {
                if(nums[mid]==nums[mid-1]){
                    st+=2;
                } else {
                    end=mid;
                }
            }
        }
        return nums[st];       

        //different approach
        // int st=0, end=nums.length-1;
        // while(st<end){
        //     int mid=st+(end-st)/2;
        //     if(mid%2==1) mid--;
        //     if(nums[mid] == nums[mid+1]) {
        //         st = mid + 2;
        //     } else {
        //         end=mid;
        //     }
        // }
        // return nums[st]; 
    }
}