public boolean sameFirstLast(int[] nums) {
    int arrLen = nums.length;
    
    if(arrLen<1) return false;

    return (nums[0]==nums[arrLen-1]);
}
