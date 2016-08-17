public int sum67(int[] nums) {
    int total=0;
    int arrLen=nums.length;
    boolean addToTotal=true;
    
    if(arrLen==0) return total;
    
    for(int i : nums) {
        if(i==6) addToTotal=false;
        else if(addToTotal==false && i==7) addToTotal=true;
        else if(addToTotal==true) total+=i;
    }
    
    return total;
}
