public String frontBack(String str) {
  int endIndex = str.length()-1;
  String result = "";
  
  if(endIndex<=0) return str;
  else if(endIndex==1) {
    result+=str.charAt(endIndex);
    result+=str.charAt(0);
    return result;
  }
  else {
    result+=str.charAt(endIndex);
    result+=str.substring(1,endIndex);
    result+=str.charAt(0);
    return result;
  }
}
