// User function Template for Java
class Solution {

    String reverseEqn(String S) {
        // your code here
        int len = S.length();
        Stack<Character> stack = new Stack<>();
        StringBuilder rev = new StringBuilder(S.length());
        
        for(int i=len-1;i>=0;i--){
            char ch = S.charAt(i);
            
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                //pop element from stack and concatenate it to reverse string
                while(!stack.isEmpty()){
                    //pop the element untill the stak is empty
                    rev.append(stack.pop());
                }
                rev.append(ch);
            } else {
                //push the character into stack
                stack.push(ch);
            }
        }
        
        while(!stack.isEmpty()){
                    //pop the element untill the stak is empty
                    rev.append(stack.pop());
        }
        
        return rev.toString();
    }
}