// class Solution {
//     public String reverseWords(String s) {
//         char ch[]=s.split(" ").toCharArray();
//         s=s.trim();   
//         String val="";
//         for(int i=ch.length-1;i>0;i--){
//                  val = val+ch[i];
//         }
//         return val;
//     }
// }
class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        // Split the string by one or more spaces using rege
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" "); // Add a single space between words
            }
        }
        return result.toString();
    }
}
