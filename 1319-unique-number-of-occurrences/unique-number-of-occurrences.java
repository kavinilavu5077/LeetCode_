class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        //for(int i =0;i<hm.size();i++){
            for(int val : hm.values()){
            if(hs.contains(val)){
                return false;
            }
            hs.add(val);
        }
        return true;
    }
}