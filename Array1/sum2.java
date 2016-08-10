public int sum2(int[] nums) {
    int result = 0;
    int arrLen = nums.length;
    
    if(arrLen==1) result = nums[0];
    else if(arrLen>1) result = nums[0] + nums[1];
    
    return result;
}
