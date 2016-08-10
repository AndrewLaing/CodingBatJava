public String theEnd(String str, boolean front) 
{
    int strLen = str.length();
    String result = "";
    
    if (front)
       result+=str.charAt(0);
    else result += str.charAt(strLen-1);
    
    return result;
}
