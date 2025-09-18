class Solution {
    public static void print_divisors(int n) {
        // code here
        // ArrayList<Integer> divisor = new ArrayList<>();

        // for(int i=1; i*i<=n;i++){
        //     if(n%i==0){
        //         divisor.add(i);
        //         if(i != n/i) divisor.add(n/i);
        //     }
        // }
        
        // Collections.sort(divisor);
        
        // for(int d:divisor){
        //     System.out.print(d + " ");
        // }
        
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
        
        int sq = (int) Math.sqrt(n);
        for(int j=sq; j>0;j--){
            if(n%j==0 && j != n/j){
                System.out.print(n/j + " ");
            }
        }
    }
}


