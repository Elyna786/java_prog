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
        
        
        //new way
        
        
    //     int sqrt = (int) Math.sqrt(n);
    //     if(isPrime(n)) return n;
        
    //     int greatPrime = 2;
    //     for(int i = 2; i<=sqrt; i++){
    //         if(n%i == 0)
    //         {
    //             if(isPrime(i))
    //               greatPrime = Math.max(greatPrime, i) ;
    //         }
    //     }
        
    //     for(int j = sqrt; j>0; j--){
    //         if(n%j == 0)
    //         {
    //             if(isPrime(n/j))
    //               greatPrime = Math.max(greatPrime, n/j) ;
    //         }
    //     }
        
    //     return greatPrime;
    // }
    
    // static boolean isPrime(int n){
    //     if(n<2) return false;
    //     if(n==2) return true;
    //     if(n%2 == 0) return false;
    //     int i=3;
        
    //     while(i*i <=n){
    //         if(n%i == 0)
    //             return false;
    //         i += 2;
    //     }
    //    return true;
   
    }
}