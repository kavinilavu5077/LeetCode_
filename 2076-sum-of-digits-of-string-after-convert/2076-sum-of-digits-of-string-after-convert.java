class Solution {
    public int getLucky(String s, int k) {
int sum=0;
for(int i=0;i<s.length();i++){
 int n = s.charAt(i)-'a'+1;
 sum += sumOf(n);
}
if(k==1){
   return sum;

}else{
    int val =0;
while(k>1){
    val = sumOf(sum);
    if(val<10){
        return val;
    }
    sum=val;
    k--;
}
return val;

}
    }
    public static int sumOf(int n){
        int sums=0;
        while(n>0){
            sums+=n%10;
            n/=10;
        }   
        return sums;
        
    }
    

    
}