public int[] reverse3(int[] nums) {
    int[] result = new int[3];
    
    for(int i=0; i<3; i++)
        result[i] = nums[2-i];
    
    return result;
}
