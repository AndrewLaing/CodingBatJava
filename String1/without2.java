public String without2(String str) {
    int strLen = str.length();
    String result="";
    
    if (strLen<2) return str;
    else if (strLen==2) return result;
    else if (str.substring(0,2).equals(str.substring(strLen-2)))
        return str.substring(2);
    else return str;
}
