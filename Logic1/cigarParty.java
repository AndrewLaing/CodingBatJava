public boolean cigarParty(int cigars, boolean isWeekend) 
{
    return ( ((!isWeekend) && (cigars>39 && cigars<61)) || (isWeekend && cigars>39) );  
}
