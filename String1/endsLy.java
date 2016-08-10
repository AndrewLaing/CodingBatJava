public boolean endsLy(String str) {
    int strLen = str.length();
    
    if(strLen<2) return false;
    else
       return ( str.substring(strLen-2).equals("ly") );
}
