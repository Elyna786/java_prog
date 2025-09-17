// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int ans =n;
        int res =0;
        while(n>0){
            int rem = n%10;
            int cub=rem*rem*rem;
            res+=cub;
            n=n/10;
        }
        if(ans==res) {
                return true;
            } else{
                return false;
            }
            
        // int sum=0;
        // int num=n;
        
        // while(n>0){
        //     int rem=n%10;
        //     int cub=rem*rem*rem;
        //     sum+=cub;
        //     n/=10;
        // }
        
        // return (num==sum);
    }
}