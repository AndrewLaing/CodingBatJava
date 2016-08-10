public boolean xyzMiddle(String str) 
{
    int strLen = str.length();
    int startPos = strLen/2;
    String xyz = "xyz";
    
    if(strLen<3) return false;

    if(strLen%2!=0) 
       return xyz.equals(str.substring( startPos-1, startPos+2 ));
  
    return str.substring(startPos-2, startPos+2).contains(xyz);
}
