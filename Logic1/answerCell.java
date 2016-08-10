public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) 
{
    if(!isAsleep) {
        if(isMorning) return isMom;
        return true;
    }
    
    return false;
}
