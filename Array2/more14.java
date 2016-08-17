public boolean more14(int[] nums) {
    int oneCount=0, fourCount=0;
    
    for(int i : nums) {
        if(i==1) oneCount++;
        else if(i==4) fourCount++;
    }
    
    return oneCount > fourCount;
}
