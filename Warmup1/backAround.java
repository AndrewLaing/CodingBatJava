public String backAround(String str) 
{
  int endIndex = str.length()-1;
  String result = "";
  
  result += str.charAt(endIndex);
  result += str;
  result += str.charAt(endIndex);
  
  return result;
}
