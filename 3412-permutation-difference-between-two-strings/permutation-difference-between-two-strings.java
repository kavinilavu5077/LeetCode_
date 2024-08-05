class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> nm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            nm.put(c,i);
        }
        Map<Character,Integer> kk=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            kk.put(c,i);
        }
        int ans=0;
        for(char c:nm.keySet())
        {
            ans=ans+Math.abs(nm.get(c)-kk.get(c));
        }
        return ans;
    }
}