public String stringX(String str) {
    int strLen = str.length();
    if(strLen<3) return str;
    
    String result ="";
    
    result += str.charAt(0);
    result += str.substring(1,strLen-1).replace("x","");
    result += str.charAt(strLen-1);    
    
    return result;
}
