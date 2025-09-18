class Solution {
    public int commonFactors(int a, int b) {
        int min = Math.min(a,b);
        int count=0;
        for( int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }

    public int findGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}