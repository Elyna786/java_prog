class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> mark = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            int x=arr[i];
            int index = Math.abs(x)-1;
            
            if(arr[index]<0){
                mark.add(Math.abs(x));
            } else {
                arr[index] = -arr[index];
            }
        }
        return mark;
    }
}