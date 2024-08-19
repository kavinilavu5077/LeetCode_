class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int i =0;
        for(int num:nums){
            if(!hm.containsKey(num)){
                i=1;
                 hm.put(num,i);
            }else{
               hm.put(num,hm.get(num)+1);
            }
        }
            int value=0;
            for(Map.Entry entry: hm.entrySet()){
                if((int)entry.getValue()==1){
                    value = (int) entry.getKey();
                }
            }
     return value;   
    }
}