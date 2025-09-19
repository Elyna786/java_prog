class Solution {
    // public int minParentheses(String s) {
    //     // code here
    //     int countopen=0, countclose=0;
    //     int len=s.length();
        
    //     for(int i=0; i<len;i++){
        
    //         if(s.charAt(i) == '('){
    //             countopen++;
    //         } else {
    //             countclose++;
    //         }
    //     }
        
    //     int max = (int) Math.max(countopen, countclose);
    //     int min = (int) Math.min(countopen, countclose);
        
    //     int diff = max-min;
        
    //     return diff;
    // }
    
    public int minParentheses(String s) {
        // code here
        int countopen=0, insertion=0;
        int len=s.length();
        
        for(int i=0; i<len;i++){
        
            char ch = s.charAt(i);
            if(ch == '('){
                countopen++;
            } else {
                if(countopen>0){
                    countopen--;
                } else {
                    insertion++;
                }
                
            }
        }
        
        return countopen+insertion;
    }
}
