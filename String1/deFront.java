public String deFront(String str) {    
    int strLen = str.length();
    String result = "";
    String front = "";
    
    if(strLen == 0) return str;
    else if(strLen==1) {
      if(str.charAt(0)=='a') return str;
      else return result;
    }
    else  {
      if(str.charAt(0)=='a') result+="a";
      if(str.charAt(1)=='b') result+="b";
    }
    if(strLen!=2) 
      result+=str.substring(2);
      
    return result;
}
