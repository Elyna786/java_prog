class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> divisor = new ArrayList<>();

        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                divisor.add(i);
                if(i != n/i) divisor.add(n/i);
            }
        }
        
        Collections.sort(divisor);
        
        for(int d:divisor){
            System.out.print(d + " ");
        }
    }
}


