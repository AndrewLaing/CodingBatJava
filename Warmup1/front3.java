public String front3(String str) {
  int strLen = str.length();
  String result = "";
  String front;
  
  if(strLen<=3) front=str;
  else front=str.substring(0,3);
  
  for(int i=0; i<3; i++)
      result+=front;
  
  return result;
}
