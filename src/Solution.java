class Solution {
    public int searchInsert(int[] nums, int target) {
        int arrLength = nums.length;
        for(int i = 0;i < arrLength;i++){
            if(target == nums[i] || target < nums[i]){
                return  i;
            }
        }
        return arrLength;
    }
}