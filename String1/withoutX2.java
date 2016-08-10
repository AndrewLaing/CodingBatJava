public String withoutX2(String str) {
    int strLen = str.length();
    String result = "";
    
    if(strLen<3) return str.replace("x","");
    result += str.substring(0,2).replace("x","") + str.substring(2);
    
    return result;
}
