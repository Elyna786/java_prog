// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        
        if (n <= 1) return -1;

			// Remove all 2s
			while ((n & 1) == 0) {
				n >>= 1;
			}

        int factor = 3;
        int lastFactor = 2;

        while (factor * factor <= n) {
            if (n % factor == 0) {
                n /= factor;
                lastFactor = factor;
                while (n % factor == 0) {
                    n /= factor;
                }
            }
            factor += 2;
        }

        if (n > 1) {
            return n;
        }

        return lastFactor;
        
        // if (n<=1) return 0;
        
        // while((n & 1) == 0){
        //     n >>= 1;
        // }
        
        // int preprime = 2, nextprime = 3;
        
        // while(nextprime <= n){
        //     if(n%nextprime==0){
        //         n/=nextprime;
        //         preprime=nextprime;
        //         while(n%nextprime==0){
        //             n/=nextprime;
        //         }
        //     }
        //     nextprime+=2;
        // }
        
        // if(n>1){
        //     return n;
        // }
        
        // return preprime;
    }
}