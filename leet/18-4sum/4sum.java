class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> add =new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        long t=(long)target;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long total=0l+nums[i]+nums[j]+nums[left]+nums[right];
                   // System.out.println(total);
                    if(total<t){
                        left++;
                    }
                    if(total>t){
                        right--;
                    }
                    if(total==t){
                        add.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        right--;
                        left++;
                    }
                }
            }
        }
        result.addAll(add);
        return result;
    }
}