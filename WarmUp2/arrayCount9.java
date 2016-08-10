public int arrayCount9(int[] nums) {
    int count = 0;
    int arrLen = nums.length;
    
    for(int i=0; i<arrLen; i++){
      if(nums[i]==9)
          count++;
    }
    
    return count; 
}
