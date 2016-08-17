public int centeredAverage(int[] nums) {
    int arrLen=nums.length;
    int total=0;
    
    Arrays.sort(nums);
    for(int i=1; i<arrLen-1; i++)
        total += nums[i];
    
    return total/(arrLen-2);
    
}
