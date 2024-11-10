// class Solution {
//     public double findMaxAverage(int[] arr, int k) {
//         double val=0.0d;

//         double sum=0.0d;
//         for(int i =0;i<k;i++){
//             sum+=arr[i];
//         }
//          val = sum/k;
//          int j =0;
//         double ans=0;
//          for(int i =k;i<arr.length;i++){
//             int pre = arr[j];
//             ans = (sum +arr[i]-pre)/k;
//             if(val <ans){
//                 val = ans;
//             }
//             j++;
//          }
//          return val;
//     }
// }
class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double sum = 0.0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double maxAvg = sum / k;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];  // Slide the window
            maxAvg = Math.max(maxAvg, sum / k);  // Update the max average
        }

        return maxAvg;
    }
}
