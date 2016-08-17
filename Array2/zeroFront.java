public int[] zeroFront(int[] nums) {
    int arrLen = nums.length;
    int[] result = new int[arrLen];
    
    int startPos = 0;
    for(int i : nums) {
        if(i==0) startPos++;
    }
    
    for(int i : nums) {
      if(i!=0) {
        result[startPos]=i;
        startPos++;
      }
    }
    
    return result;
}
