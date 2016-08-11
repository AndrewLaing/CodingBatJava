public String mixString(String a, String b) {
    int strLenA = a.length();
    int strLenB = b.length();
    int max = 0;
    String result = "";
    String excess = "";
    
    if(strLenA==0) return b;
    else if(strLenB==0) return a;
    
    if(strLenA>strLenB) {
       max = strLenB;
       excess = a.substring(max);
    }
    else if(strLenA<strLenB) {
       max = strLenA;
       excess = b.substring(max);
    }
    else max=strLenA;
    
    for(int i=0; i<max; i++) {
        result+=a.charAt(i);
        result+=b.charAt(i);
    }
    
    result+=excess;
    return result;
}
