public String zipZap(String str) {
    int strLen = str.length();
    String result = "";
    
    if(strLen<3) return str;
    
    result = str.replaceAll("(z.p)", "zp");
    return result;
}
