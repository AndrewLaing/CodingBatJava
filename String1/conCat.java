public String conCat(String a, String b) 
{
    int strLenA = a.length();
    int strLenB = b.length();
    
    if(strLenA==0) return b;
    if(strLenB==0) return a;
    
    String result = a;
    
    if( a.charAt(strLenA-1) == b.charAt(0) ) {
        if(b.length()>1)
            result+=b.substring(1);
    }
    else result += b;
    
    return result;
}
