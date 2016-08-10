public String plusOut(String str, String word) 
{
    String result = "";
    int wordLen = word.length();
    
    for(int i=0; i<str.length(); i++) {
        if( str.substring(i).startsWith(word) ) {
            for(int j=0; j<wordLen; j++) {
                result+=str.charAt(i);
                i++;
            }
            i--;
        }
        else
            result += "+";
    }
    
    return result;
}
