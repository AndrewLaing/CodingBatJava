public boolean tripleUp(int[] nums) {
    int arrLen = nums.length;
    if(arrLen<3) return false;
    int count=1, prev;
    prev = nums[0];
    
    for(int i=1; i<arrLen; i++) 
    {
        if(nums[i]==prev+1) 
            count++;
        else count=1;
        
        if(count==3) return true;

        prev = nums[i];
    }

    return false;
}
