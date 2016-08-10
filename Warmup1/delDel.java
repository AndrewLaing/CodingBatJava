public String delDel(String str) {
  int strLen = str.length();
  String result = "";
  
  if(strLen<4) result = str;
  else if(strLen==4){
    if(str.substring(1,4).equals("del"))
        result+=str.charAt(0);
    else result=str;
  }
  else {
    if(str.substring(1,4).equals("del")) {
        result+=str.charAt(0);
        result+=str.substring(4);
    }
    else result=str;
  }
  return result;
}
