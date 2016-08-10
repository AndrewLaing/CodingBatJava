public boolean prefixAgain(String str, int n) 
{
    int strLen = str.length();
    if(strLen<2) return false;
    
    String prefixStr = str.substring(0,n);
    return str.substring(1).indexOf(prefixStr)!=-1;
}
