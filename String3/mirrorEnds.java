public String mirrorEnds(String string) 
{
    int strLen = string.length();
    String reverse, result="";

    if(strLen<2) return string;
    
    for(int i=0; i<strLen; i++) 
    {
        reverse = "";
        for(int j=i; j>=0; j--)
            reverse += string.charAt(j);
      
        if( string.endsWith(reverse) )
            result=string.substring(0,i+1);
    }
    
    return result;
}
