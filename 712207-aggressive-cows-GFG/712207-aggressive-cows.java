class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        
        Arrays.sort(stalls);
        
        int st=1;
        int end=stalls[stalls.length-1] - stalls[0];
        int result=0;
        
        while(st<=end){
            int mid=st+(end-st)/2;
            
            if(cowplace(stalls, k, mid)){
                result= mid;
                st=mid+1;
            } else {
                end=mid-1;
            }
        }
        return result;
    }
    
    public boolean cowplace(int[] stalls, int k, int mid){
        int count=1;
        int lastpos = stalls[0];
        
        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-lastpos >= mid){
                count++;
                lastpos = stalls[i];
                if (count>=k) return true;
            } 
        }
        return false;
        
    }
}