public int[] midThree(int[] nums) {
    int arrLen = nums.length;
    int[] result = new int[3];
    int firstIndex = ((arrLen-1)/2)-1;
    
    if(arrLen==3) return nums;
    
    for(int i=0; i<3; i++)
       result[i]=nums[firstIndex+i];
       
    return result;
}
