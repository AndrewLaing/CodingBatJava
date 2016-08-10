public boolean arrayFront9(int[] nums) 
{
    int arrLen = nums.length;
    
    for(int i=0; i<arrLen; i++) {
        if(i>3) return false;
        if(nums[i]==9) return true;
    }
    
    return false;
}
