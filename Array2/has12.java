public boolean has12(int[] nums) {
    boolean hasOne=false, hasTwo=false;
    
    for(int i : nums) {
        if(i==1) hasOne=true;
        if(hasOne) {
            if(i==2) hasTwo=true;
        }
    }
    
    return hasTwo;
}
