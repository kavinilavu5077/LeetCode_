class Solution {
    public boolean isAnagram(String s, String t) {
      char ch[]=  s.toCharArray();
       char ch1[]= t.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch1);
      if(ch.length!=ch1.length){
        return false;
      }
      int count =0;
      for(int i=0;i<ch.length;i++){
        if(ch[i]==ch1[i]){
           count++;
        }else{
            break;
        }
      
      }
      boolean val = false;
      if(count==ch.length){
             val = true;
      } 
      return val;
    }
}