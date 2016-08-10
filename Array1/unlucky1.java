public boolean unlucky1(int[] nums) {
    int arrLen = nums.length;
    
    if(arrLen<2) return false;
    else if(arrLen==2)
      return (nums[0]==1 && nums[1]==3);
    else if ( (nums[0]==1 && nums[1]==3) || (nums[1]==1 && nums[2]==3) )
      return true;

    if(nums[arrLen-2]==1 && nums[arrLen-1]==3) return true;
    
    return false;
}
