public String middleThree(String str) 
{
    int strLen = str.length();
    String result;

    if(strLen==3) return str;
    
    int endIndex = ((strLen+1)/2);
    return str.substring(endIndex-2, endIndex+1);
}
