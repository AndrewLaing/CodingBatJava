public boolean isEverywhere(int[] nums, int val) {
    boolean prev=true;
    
    for(int i : nums) {
        if(i!=val && prev==false)
            return false;
        if(i==val) prev=true;
        else prev=false;
    }
    
    return true;
}
