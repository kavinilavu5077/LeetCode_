class Solution {
    public int lengthOfLastWord(String s) {
      int count = 0; 
        boolean found = false; 
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                found = true;
            } 
            else if (found) {
                return count;
            }
        }
        return count;   
    }
}