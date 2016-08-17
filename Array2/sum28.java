public boolean sum28(int[] nums) {
    int total = 0;
    
    for(int i : nums) {
        if(i==2) total+=2;
    }
    
    return total==8;
}
