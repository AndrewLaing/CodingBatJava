public int[] evenOdd(int[] nums) 
{
    int arrLen = nums.length;
    if(arrLen<2) return nums;
    
    int[] result = new int[arrLen];
    int resPosition = 0;
    
    for(int i : nums) {
      if(i%2==0) {
        result[resPosition]=i;
        resPosition++;
      }
    }
    
    for(int i : nums) {
      if(i%2!=0) {
        result[resPosition]=i;
        resPosition++;
      }
    }
    
    return result;
}
