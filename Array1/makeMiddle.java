public int[] makeMiddle(int[] nums) {
    int arrLen = nums.length;
    int[] result = new int[2];
    
    if(arrLen==2) return nums;
    
    result[0]=nums[(arrLen/2)-1];
    result[1]=nums[arrLen/2];
    
    return result;
}
