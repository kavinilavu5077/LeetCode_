class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> s= new HashSet<>();
        for(char str : jewels.toCharArray()){
                 s.add(str);
        }
        int count =0;
        for(int i =0;i<stones.length();i++){
            if(s.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}