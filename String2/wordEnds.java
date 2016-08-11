public String wordEnds(String str, String word) {
    int strLen = str.length();
    int wordLen = word.length();
    String result = "";
    
    if(strLen==0) return result;
    else if(wordLen>=strLen) return result;
    else if(!str.contains(word)) return result;
    
    for(int i=0; (i+wordLen)<=strLen; i++) {
        if( str.substring(i).startsWith(word) ) 
        {
            if(i>0) result+=str.charAt(i-1);
            if(i<strLen-wordLen) result+=str.charAt(i+wordLen);
        }
    }
    
    return result;
}
