public int[] shiftLeft(int[] nums) {
    int arrLen = nums.length;
    if(arrLen<2) return nums;
    
    int result[] = new int[arrLen];
    

    for(int i=0; i<arrLen-1; i++) {
        result[i] = nums[i+1];
    }
        result[arrLen-1] = nums[0];
        
    return result;
}
