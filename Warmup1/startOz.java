public String startOz(String str) {
  int strLen = str.length();
  String result = "";
  
  if (strLen==1 && str.equals("o")){
        result+='o';
  }
  else if (strLen>1) {
    if(str.charAt(0)=='o')
        result+='o';
    if(str.charAt(1)=='z')
        result+='z';
  }
  return result;
}
