class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
           int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int total=nums[i]+nums[left]+nums[right];
            //System.out.println(""+Math.abs(total));
               if(Math.abs(target-total)<Math.abs(target-sum)){
                   sum=total;
               }
               if(total<target){
                   left++;
               }
               else
                right--;
        }
    }
     return sum;
}
}