public String lastChars(String a, String b) {
    int strBLen = b.length(); 
    String result = "";
    
    if(a.length()==0)
        result+="@";
    else result+=a.charAt(0);

    if(strBLen==0)
        result+="@";
    else result+=b.charAt(strBLen-1);
    
    return result;
    
}
