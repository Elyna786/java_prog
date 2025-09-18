class Solution {
    public int prime_Sum(int n) {
        // code here
        
    //     if (n<2) return 0;
        
    //     boolean[] isPrime = new boolean[n+1];
    //     Arrays.fill(isPrime,true);
    //     isPrime[0]  = isPrime[1] = false;
        
    //     for(int i = 2; i*i<=n; i++){
            
    //       if(isPrime[i]){
    //           for(int j=i*i; j<=n; j+=i){
    //               isPrime[j] = false;
    //           }
    //       }
    //     }
    //     int sum=0;
    //     for(int i=2; i<=n; i++){
    //         if(isPrime[i]){
    //             sum += i;
    //         }
    //     }
        
    //     return sum;
    // }   
        int sum=0;
        for(int i = 2; i<=n; i++){
                if(isPrime(i)){
                    sum+=i;
                }
        }
        return sum;
    }
    
    public boolean isPrime(int num){
        if(num <= 1) return false;
        if(num ==2 ) return true;
        if(num%2 ==0) return false;
        for( int i=3;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}