class Solution {
    public double average(int[] salary) {
       Arrays.sort(salary);
       int min = salary[0];
       int max = salary[salary.length-1];
       double count=0;
       double sum=0;
      // double res;
       for(int i=0;i<salary.length;i++){
          if(salary[i]==min || salary[i]==max){
            continue;
          }else{
            count++;
            sum += salary[i];
          }
       }
       double res= sum/count;
       return res;
    }
}