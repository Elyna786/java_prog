// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
        // int i=1;
        // int count=0;
        // while(i*i<n){
        //     count++;
        //     i++;
        // }
        
        // return count;
        
        int count=0;
        for(int i =1; i*i <n; i++){
            count++;
        }
        return count;
    }
}