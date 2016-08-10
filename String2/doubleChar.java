public String doubleChar(String str) {
    int strLen = str.length();
    String result="";
    
    for(int i=0; i<strLen; i++){
        result+=str.charAt(i);
        result+=str.charAt(i);
    }
    return result;
}
