public String notReplace(String str) 
{
  int strLen = str.length();
  String result = "";
  
  if(strLen<2) return str;
  else if(strLen==2)  {
      if(str.equals("is"))
          return "is not";
      else return str;
  }
  
  str = " " + str + "  ";

  /* Forgive me for the following; I had been programming in Scheme the previous week. :p */
  for (int i=0; i<strLen+1; i++) 
  {
    if( (    str.charAt(i)   == 'i' 
          && str.charAt(i+1) == 's' 
        )
        && 
        (    !Character.isLetter(str.charAt(i-1)) 
          && !Character.isLetter(str.charAt(i+2))
        )
      ) 
    {
      result+="is not";
      i++;
    } 
    else result += str.charAt(i);
  }
  return result.substring(1);
}
