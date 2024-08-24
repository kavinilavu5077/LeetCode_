class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int count=0;
       boolean prev = false;
       boolean next = false;
        for(int i =0;i<flowerbed.length;i++){

             if(flowerbed[i]==0 )
             {
                prev = (i==0) || (flowerbed[i-1]==0);
                   next = (i==flowerbed.length-1) || (flowerbed[i+1]==0);
                  if(prev && next){
                    flowerbed[i]=1;
                    count++;
                    i++;
                   }
             }
              
        }
        if(count>=n){
            return true;
        }
        
    return false;
}}

