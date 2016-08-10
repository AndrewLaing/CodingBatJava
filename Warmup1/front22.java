public String front22(String str) {
  int strLen = str.length();
  String result = "";
  String front = "";
  
  if(strLen<2) front =str;
  else front=str.substring(0,2);

  result += front;
  result += str;
  result += front;
  
  return result;
}
