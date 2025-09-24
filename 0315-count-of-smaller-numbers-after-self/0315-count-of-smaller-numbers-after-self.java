class Solution {
    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;
        Integer[] result = new Integer[n];
        int[] indexes = new int[n];

        // Initialize original indices
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
            result[i] = 0; // Initialize result to 0
        }

        mergeSort(nums, indexes, result, 0, n - 1);
        return Arrays.asList(result);
    }

    private void mergeSort(int[] nums, int[] indexes, Integer[] result, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, indexes, result, left, mid);
        mergeSort(nums, indexes, result, mid + 1, right);

        merge(nums, indexes, result, left, mid, right);
    }

    private void merge(int[] nums, int[] indexes, Integer[] result, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;       // Pointer for left half
        int j = mid + 1;    // Pointer for right half
        int k = 0;          // Pointer for temp
        int rightCount = 0; // Number of smaller elements from right half

        while (i <= mid && j <= right) {
            if (nums[indexes[j]] < nums[indexes[i]]) {
                temp[k++] = indexes[j++];
                rightCount++;
            } else {
                result[indexes[i]] += rightCount;
                temp[k++] = indexes[i++];
            }
        }

        // Remaining elements in left half
        while (i <= mid) {
            result[indexes[i]] += rightCount;
            temp[k++] = indexes[i++];
        }

        // Remaining elements in right half
        while (j <= right) {
            temp[k++] = indexes[j++];
        }

        // Copy back to original indexes
        for (int p = 0; p < temp.length; p++) {
            indexes[left + p] = temp[p];
        }

        // int len=nums.length-1;        
        // ArrayList<Integer> elements = new ArrayList<>();
        // for(int i=0; i<=len; i++){
        //     int count=0;
        //     for(int j=i+1;j<=len;j++){
        //         if(nums[i]>nums[j]){
        //             count++;
        //         }
        //     }
        //     elements.add(count);
        // }
        // return elements;
    }
}