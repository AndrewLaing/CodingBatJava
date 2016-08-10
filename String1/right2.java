public String right2(String str) {
    int strLen = str.length();
    String result = "";
    
    if(strLen<3) return str;
    
    result += str.substring(strLen-2);
    result += str.substring(0, strLen-2);
    
    return result;
}
