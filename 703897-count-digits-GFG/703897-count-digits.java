// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int num = n;
        while(n>0){
            int d=n%10;
            if(d !=0){
                if(num%d==0){
                    count++;
                }
            }
            n=n/10;
        }
        return count;
    }
}

