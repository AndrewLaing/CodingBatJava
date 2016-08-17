public boolean has22(int[] nums) {
    int twos=0;
    
    for(int i : nums) 
    {
        if(i==2) twos++;
        else twos=0;
        
        if(twos==2) return true;
    }
    return false;
}
