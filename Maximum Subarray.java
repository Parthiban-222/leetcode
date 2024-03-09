class Solution {
    public int maxSubArray(int[] nums) {
        int a=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(a<0){
                a=0;
            }
            a+=nums[i];
            max=Math.max(max,a);
        }
        return max;
    }
}
  
