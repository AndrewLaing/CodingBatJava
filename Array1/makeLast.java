public int[] makeLast(int[] nums) 
{
    int arrLen = nums.length;
    int[] result = new int[arrLen*2];
    
    result[(arrLen*2)-1] = nums[arrLen-1];
    
    return result;
}
