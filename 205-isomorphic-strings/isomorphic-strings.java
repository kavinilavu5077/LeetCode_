class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Integer> h1= new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
         for(int i =0;i<s.length();i++){
            if(!h1.containsKey(s.charAt(i))){
                  h1.put(s.charAt(i),i);
    }      if(!h2.containsKey(t.charAt(i))){
                  h2.put(t.charAt(i),i);
    }
    if(h1.get(s.charAt(i))!=h2.get(t.charAt(i))){
        return false;
         }
         }
    return true;
    }
}