public int[] withoutTen(int[] nums) {
    int arrLen=nums.length;
    int[] result = new int[arrLen];
    int resPosition = 0;
    
    for(int i=0; i<arrLen; i++) {
        if(nums[i]!=10) {
          result[resPosition]=nums[i];
          resPosition++;
        }
    }
    
    return result;
}
