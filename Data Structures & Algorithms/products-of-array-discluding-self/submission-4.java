class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int isZero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                total *= nums[i];
            }
            else {
                isZero++;
            }
        }
        int[] ans = new int[nums.length];
        int i=0;
        while(i < nums.length){
            int prod = total;
            if(isZero > 0){
                if(nums[i] == 0 && isZero == 1){
                    ans[i] = total;
                }else {
                    ans[i] = 0;
                }
            }
            else{
                ans[i] = prod/nums[i];
            }
            i++;
        }
        return ans;
    }
}  
