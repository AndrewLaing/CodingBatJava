public boolean bobThere(String str) 
{
    int strLen = str.length();
    
    if(strLen<3) return false;
    for(int i=0; i<strLen-2; i++) {
        if(str.charAt(i)=='b' && str.charAt(i+2)=='b') return true;
    }
    return false;
}
