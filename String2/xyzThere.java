public boolean xyzThere(String str) {
    int strLen = str.length();
    int xyzPosition = str.indexOf("xyz");
    
    if(strLen<3) return false;
    else if(strLen==3) return xyzPosition==0;
    
    if(xyzPosition==-1) return false;
    else if(xyzPosition==0) return true;
    
    for(int i=1; i<strLen-2; i++) {
        if( str.substring(i).startsWith("xyz") )
            if( str.charAt(i-1)!='.' )
                return true;
    }
    return false;
}
