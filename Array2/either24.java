public boolean either24(int[] nums) 
{
    int arrLen = nums.length;
    if(arrLen<2) return false;
    
    boolean twoNextToTwo=false, fourNextToFour=false;    
    int prev = 0;
    
    for(int i : nums) {
        if(i==2 && prev==2)
            twoNextToTwo=true;
        else if(i==4 && prev==4)
            fourNextToFour=true;
        prev=i;
    }
    
    return ((twoNextToTwo || fourNextToFour) && (twoNextToTwo!=fourNextToFour));
}
