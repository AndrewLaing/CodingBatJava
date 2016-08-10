public String withouEnd2(String str) {
    int strLen = str.length();
    if(strLen<3) return "";
    return str.substring(1,strLen-1);
}
