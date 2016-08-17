public int sum13(int[] nums) {
    int arrLen = nums.length;
    int total = 0, temp;
    
    if(arrLen==0) return total;
    
    for(int i=0; i<arrLen; i++) {
        temp = nums[i]; 
        if(temp==13) i++;
        else total+=temp;
    }
    
    return total;
}
