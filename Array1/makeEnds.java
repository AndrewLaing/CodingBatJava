public int[] makeEnds(int[] nums)
{
    int arrLen = nums.length;
    int[] result = new int[2];
    
    if(arrLen<2) {
        result[0] = nums[0];
        result[1] = nums[0];;
    }
    else {
        result[0] = nums[0];
        result[1] = nums[arrLen-1];
    }
    return result;
}
