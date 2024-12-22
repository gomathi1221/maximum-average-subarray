class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int n=nums.length;
        int max=Integer.MIN_VALUE;
       
       int sum=0;
       for(int i=0;i<k;i++){
        sum+=nums[i];
       }
       max=sum;
       for(int r=k;r<nums.length;r++){
        sum=sum+nums[r]-nums[r-k];

        max=Math.max(sum,max);
       }
       return (double) max/k;

    }
} 