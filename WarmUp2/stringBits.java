public String stringBits(String str) {
  int strLen = str.length();
  String result = "";
  
  for(int i=0; i<strLen; i++) {
      if(i%2==0)
          result+=str.charAt(i);
  }
  return result;
}
