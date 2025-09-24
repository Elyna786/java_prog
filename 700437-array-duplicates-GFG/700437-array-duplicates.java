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
        
        
        //different code using hashpmap
        // ArrayList<Integer> result = new ArrayList<>();
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int num : arr) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() == 2) {
        //         result.add(entry.getKey());
        //     }
        // }

        // return result;
    }
}