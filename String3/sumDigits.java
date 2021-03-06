public int sumDigits(String str) {
    int strLen = str.length();
    int total=0;
    
    if(strLen==0) return total;
    for(int i=0; i<strLen; i++) {
        if( Character.isDigit(str.charAt(i)) )
            total += Integer.parseInt(str.substring(i,i+1));
    }
    
    return total;
}
