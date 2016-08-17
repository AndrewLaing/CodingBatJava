public int[] post4(int[] nums) {
    int arrLen = nums.length;
    int lastFourPos=arrLen-1;
    
    for(int i=arrLen-1; i>=0; i--) {
        if(nums[i]==4) {
            lastFourPos=i;
            i=-1;
        }
    }
    
    int resLen = arrLen-1-lastFourPos;
    int result[] = new int[resLen];
    
    for(int i=0; i<resLen; i++)
        result[i]=nums[lastFourPos+i+1];
        
    return result;
}
