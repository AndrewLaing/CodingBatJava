public int bigDiff(int[] nums) {
    int arrLen = nums.length;
    if(arrLen<2) return 0;
    int max=nums[0], min=nums[0];
    
    for(int i : nums) {
        if(i<min) min=i;
        if(i>max) max=i;
    }
    
    return max-min;
}
