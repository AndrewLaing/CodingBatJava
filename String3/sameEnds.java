public String sameEnds(String string) {
    int strLen = string.length();
    
    String test, result="";
    if(strLen<2) return result;
    
    for(int i=0; i<strLen/2+1; i++) {
        test = string.substring(0,i);
        if( string.endsWith(test) )
            result=test;
    }
    
    return result;
}
