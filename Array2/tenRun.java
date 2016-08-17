public int[] tenRun(int[] nums) {
    int arrLen = nums.length;
    if(arrLen<2) return nums;
    
    int[] result = new int[arrLen];
    boolean makeMultiple = false;
    
    int resIndex=0, addMe=0;
    
    for(int i : nums) 
    {
        if(makeMultiple && i%10!=0) result[resIndex]=addMe;
        else result[resIndex]=i;
        
        resIndex++;
        
        if(i%10==0) {
            addMe = i;
            //if(makeMultiple==true) makeMultiple=false;
            makeMultiple = true;
        }
    }
    
    return result;
}
