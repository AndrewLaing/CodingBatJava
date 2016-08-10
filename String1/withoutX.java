public String withoutX(String str) 
{
    int strLen = str.length();
    String result = str;
    
    if(strLen==0) return str;
    
    if(str.charAt(0)=='x')
    {
      if(strLen==1) return "";
      
      if(str.charAt(strLen-1)=='x')
          return str.substring(1,strLen-1);
      else 
          return result.substring(1);
    }
    
    if(str.charAt(strLen-1)=='x') {
      return result.substring(0,strLen-1);
    }
    
    return result;
}
