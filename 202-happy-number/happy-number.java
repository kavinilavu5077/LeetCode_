class Solution {
    public boolean isHappy(int n) {
    Set<Integer> visit = new HashSet<>();
    while (!visit.contains(n)) {
          visit.add(n);
          n = func(n);
       } 
        if(n==1){
            return true;
        }

    return false;   
    }
    public int func(int n){
        int res=0;
        while(n!=0){
        int val = n%10;
        res += (val*val);
        n /=10;
    }
    return res;
}
}