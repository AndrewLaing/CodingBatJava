public int[] maxEnd3(int[] nums) 
{
    int max=0;
    int[] result = new int[3];
    
    if(nums[0] > nums[2]) max = nums[0];
    else max = nums[2];
    
    for(int i=0; i<3; i++)
        result[i]=max;
    
    return result;
}
