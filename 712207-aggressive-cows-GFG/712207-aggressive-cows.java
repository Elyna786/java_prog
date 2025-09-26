class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        
        Arrays.sort(stalls);  // Step 1: Sort the stalls

        int low = 1;  // Minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0];  // Max possible distance
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(stalls, k, mid)) {
                result = mid;      // Try for a bigger minimum distance
                low = mid + 1;
            } else {
                high = mid - 1;    // Try for a smaller distance
            }
        }

        return result;
    }

    // Helper method to check if we can place cows with at least 'minDist' between them
    private boolean canPlaceCows(int[] stalls, int k, int minDist) {
        int count = 1;  // Place the first cow in the first stall
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDist) {
                count++;
                lastPos = stalls[i];
                if (count >= k) return true;
            }
        }

        return false;
        
    }
}