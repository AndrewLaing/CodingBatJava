public int[] zeroMax(int[] nums) 
{
    int arrLen = nums.length;
    int max=0;
    if(arrLen<2) return nums;
    
    for(int i=0; i<arrLen-1; i++) {
        if(nums[i]==0) {
            max=0;
            for(int j=i; j<arrLen; j++) {
                if(nums[j]%2!=0 && nums[j]>max)
                    max=nums[j];
            }
            nums[i]=max;
        }
    }
    
    return nums;
}
