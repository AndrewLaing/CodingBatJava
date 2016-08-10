public String missingChar(String str, int n) 
{
  int strLen = str.length();
  String result = "";
  
  for(int i=0; i < strLen; i++){
    if(i!=n) result += str.charAt(i);
  }
  
  return result;
}
