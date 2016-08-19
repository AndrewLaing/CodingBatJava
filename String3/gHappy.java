public boolean gHappy(String str) 
{
    int strLen = str.length();
    if(strLen==0) return true;
    if(strLen<2) return false;
    
    for(int i=1; i<strLen-1; i++) {
        if(str.charAt(i)=='g')
            if(str.charAt(i-1)!='g' && str.charAt(i+1)!='g')
                return false;
    }
    
    if(str.charAt(strLen-1)=='g' && str.charAt(strLen-2)!='g') 
        return false;

    return true;
}
