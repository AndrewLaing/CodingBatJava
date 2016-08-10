public int[] swapEnds(int[] nums) 
{
    int arrLen = nums.length;
    int temp;
    
    if(arrLen<2) return nums;
    temp = nums[0];
    nums[0] = nums[arrLen-1];
    nums[arrLen-1] = temp;
    
    return nums;
}
