class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2){
            int j=i+1,k=nums.length-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                set.add(Arrays.asList(nums[i],nums[j],nums[k]));
            }
            if(sum>0)
            k--;
            else
            j++;
            }
            i++;
        }
        result.addAll(set);
        return result;
    }
}