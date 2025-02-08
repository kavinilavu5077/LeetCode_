class Solution {
    public char findTheDifference(String s, String t) {
int sums=0,sumt=0;
for(int i=0;i<s.length();i++){
    sums += (int) s.charAt(i);
}
for(int j=0;j<t.length();j++){
    sumt += (int) t.charAt(j);
}
return (char)(sumt-sums); 
    }
}