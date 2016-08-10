public String repeatFront(String str, int n) {
    int strLen = str.length();
    String result = "";
    
    if(strLen<2) return str;
    for(int i=n; i>0; i--)
        result+=str.substring(0,i);
        
    return result;
}
