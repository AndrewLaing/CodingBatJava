public String left2(String str) {
    int strLen = str.length();
    String result = "";
    
    if(strLen<3) return str;
    result+=str.substring(2);
    result+=str.substring(0,2);
    
    return result;
}
