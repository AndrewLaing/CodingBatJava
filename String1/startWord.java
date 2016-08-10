public String startWord(String str, String word) 
{
    int wordLen = word.length();
    
    if(str.equals("")) return str;
    if(wordLen==1) return str.substring(0,1);
    
    String test = word.substring(1);
    
    if(str.indexOf(test)==1) return str.substring(0, wordLen);
    else return "";
}
