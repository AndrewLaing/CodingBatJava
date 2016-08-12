public boolean makeBricks(int small, int big, int goal) 
{
    int totalSmall = small*1;
    int totalBig   = big*5;
    
    if(totalSmall>=goal) return true;
    if(totalBig>=goal && goal%5==0) return true;

    if(goal%5 <= totalSmall && goal<totalBig) return true;
    if(goal-totalBig <= totalSmall && goal>totalBig) return true;

    return false;
}
