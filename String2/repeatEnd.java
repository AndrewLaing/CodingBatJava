public String repeatEnd(String str, int n) {
    int strLen = str.length();
    String result = "";
    
    if(strLen > 0) {
        for(int i=0; i<n; i++)
            result+=str.substring(strLen-n, strLen);
    }
    return result;
}
