class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        
        boolean isNegative = false;
        if(s1.charAt(0) == '-'){
            isNegative = !isNegative;
            s1=s1.substring(1);
        }
        if(s2.charAt(0) == '-'){
            isNegative = !isNegative;
            s2=s2.substring(1);
        }
        
        s1 = removeLeadingZeros(s1);
        s2 = removeLeadingZeros(s2);
        
        if(s1.equals("0") || s2.equals("0")){
            return "0";
        }
        
        int a=s1.length(), b=s2.length();
        
        int[] res = new int[a+b];
        
        
        for(int i=a-1; i>=0; i--){
            int d1 = s1.charAt(i) - '0';
            for(int j=b-1; j>=0; j--){
                int d2=s2.charAt(j) - '0';
                int mul = d1*d2;
                int sum = mul + res[i+j+1];
                res[i+j+1] = sum%10;
                res[i+j] += sum/10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int num: res){
        if(!(sb.length() == 0 && num == 0)){
            sb.append(num);
        }
        }
        
        if (isNegative) sb.insert(0, '-');
        return sb.length() == 0? "0": sb.toString();
        
    }
    
    public String removeLeadingZeros(String s){
        int i=0;
            while(i<s.length()-1 && s.charAt(i)=='0'){
                i++;
            }
        return s.substring(i);
    }
}