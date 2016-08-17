public boolean has77(int[] nums) {
    int wasSeven=0;
    int between = 0;
    
    for(int i : nums) {
        if(i==7) wasSeven+=1;
        if(wasSeven>0 && i!=7) between++;
        if(wasSeven>0 && between>1) {
            wasSeven=0;
            between=1;
        }
        if(wasSeven==2) return true;
    }
    
    return false;
}
