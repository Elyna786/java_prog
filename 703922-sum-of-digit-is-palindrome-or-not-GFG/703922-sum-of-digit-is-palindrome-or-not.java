// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        
        while(n>0){
            int rem = n%10;
            sum += rem;
            n/=10;
        }
        
        int temp=sum, rev =0;
        
        while(temp>0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp/=10;
        }
        
        return (sum == rev);
    }
     
   
}