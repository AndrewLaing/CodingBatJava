public boolean sameStarChar(String str) {
    int strLen =  str.length();
    int starPos = str.indexOf("*");
    boolean result=true;
    
    if( strLen<1 || starPos==-1 ) 
        return result;
    else if(strLen==2) return result;
    
    for(int i=1; i<strLen-1; i++) {
        if(str.charAt(i)=='*') {
            if(str.charAt(i-1)!=str.charAt(i+1))
                result=false;
        }
    }
    
    return result;
}
