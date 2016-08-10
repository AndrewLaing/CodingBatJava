public String oneTwo(String str) {
    int strLen = str.length();
    String result = "";
    
    if(strLen<3) return "";
    for(int i=0; i<strLen-2; i+=3) {
        result += str.charAt(i+1);
        result += str.charAt(i+2);
        result += str.charAt(i);
    }
    
    return result;
}
