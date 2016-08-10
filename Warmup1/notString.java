public String notString(String str) {
  int strLen = str.length();
  String result = "";
  
  if(strLen<3) {
        result += "not ";
        result += str;
  }
  else {
      if(str.substring(0,3).equals("not"))
          return str;
      else {
        result += "not ";
        result += str;
      }
  }
  return result;
}
