public boolean twoTwo(int[] nums) {
    int arrLen = nums.length;
    
    if(arrLen<1) return true;
    else if(arrLen==1) return nums[0]!=2;
    
    for(int i=1; i<arrLen; i++) {
        if(nums[i]==2 && nums[i-1]!=2) {
            if(i<arrLen-1) {
                if(nums[i]==2 && nums[i+1]!=2)
                    return false;
            }
            else
                return false;
        }
    }
    
    return true;
}
