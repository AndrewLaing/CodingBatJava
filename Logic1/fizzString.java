public String fizzString(String str) 
{
    int strLen = str.length();
    String result = "";
    
    if (strLen<1) return str;
    else if( str.charAt(0)=='f') {
      result += "Fizz";
      if( str.charAt(strLen-1)=='b') {
         result += "Buzz";
      }
      return result;
    }
    else if( str.charAt(strLen-1)=='b') {
       result += "Buzz";
       return result;
    }
    return str;
}
