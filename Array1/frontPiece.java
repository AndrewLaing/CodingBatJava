public int[] frontPiece(int[] nums) {
    int arrLen = nums.length;
    int[] result = new int[2];
    
    if(arrLen<2) return nums;
    result[0] = nums[0];
    result[1] = nums[1];
    
    return result;
}
