public boolean sameEnds(int[] nums, int len) {
    int arrLen = nums.length;
    
    for(int i=0; i<len; i++) {
        if(nums[i]!=nums[arrLen-len+i]) return false;
    }
    
    return true;
}
