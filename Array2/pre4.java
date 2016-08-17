public int[] pre4(int[] nums) {
    int indexOfFour=0;
    int arrLen = nums.length;
    
    for(int i=0; i<arrLen; i++) {
        if(nums[i]==4) {
            indexOfFour = i;
            i=arrLen;
        }
    }
    
    int[] result = new int[indexOfFour];
    
    for(int i=0; i<indexOfFour; i++) {
        result[i] = nums[i];
    }
    
    return result;
}
