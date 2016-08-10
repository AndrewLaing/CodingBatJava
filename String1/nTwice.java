public String nTwice(String str, int n) {
    int strLen=str.length();
    String result=str.substring(0,n);
    result+=str.substring(strLen-n);
    return result;
}
