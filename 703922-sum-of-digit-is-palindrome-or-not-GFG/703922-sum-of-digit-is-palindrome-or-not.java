// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        
        while(n>0){
            sum += n%10;
            n/=10;
        }
        
        int temp=sum, rev =0;
        
        while(temp>0){
            rev = rev*10 + (temp%10);
            temp/=10;
        }
        
        return (sum == rev);
    }
     
   
}