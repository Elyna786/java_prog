class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcd = computeGcd(a,b);
        int lcm = (a*b)/gcd;
        return new int[]{lcm, gcd};
    
    }

    //Euclidean approach for gcd
    // public static int computeGcd(int a, int b){
       
    //         while(b!=0){
    //             int temp=b;
    //             b=a%b;
    //             a=temp;
    //         }
    //         return a;
    // }
    
    //recursive approach for gcd, Recursive Euclidean algorithm
    private static int computeGcd(int a, int b) {
        if (b == 0)
            return a;
            return computeGcd(b, a % b);
    }
}