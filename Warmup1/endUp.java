public String endUp(String str) {
  int strLen = str.length();
  String result = "";

  if(strLen==0) return str;
  else if(strLen<=3) return str.toUpperCase();
  else {
    result += str.substring(0,strLen-3);
    result += str.substring(strLen-3).toUpperCase();
    return result;
  }
}
