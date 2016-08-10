public String lastTwo(String str) {
    int strLen = str.length();
    String result = "";
    
    if(strLen<2) return str;
    else if(strLen==2)
            result += str.substring(strLen-1,strLen) + str.substring(0,1);
    else 
      result += str.substring(0,strLen-2) +  str.substring(strLen-1) + str.substring(strLen-2, strLen-1);
    return result;
}
