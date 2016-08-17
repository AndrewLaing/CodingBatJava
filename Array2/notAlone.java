public int[] notAlone(int[] nums, int val) {
    int arrLen = nums.length;
    if(arrLen<3) return nums;
    
    int before=0, after=0;
    
    for(int i=1; i<arrLen-1; i++) 
    {
        before=nums[i-1];
        after=nums[i+1];
        
        if(nums[i]==val) {
            if(before!=nums[i] && after!=nums[i])
                nums[i] = (before>after) ? before : after;
        }
    }
    
    return nums;
}
