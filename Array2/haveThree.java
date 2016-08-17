public boolean haveThree(int[] nums) {
    int count=0, prev=0;
    
    for(int i : nums) {
        if(i==3 && prev==3) return false;
        if(i==3) count++;
        prev=i;
    }
    
    return count==3;
}
