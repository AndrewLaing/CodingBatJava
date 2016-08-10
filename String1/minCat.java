public String minCat(String a, String b) {
    String result = "";
    int strLenA = a.length();
    int strLenB = b.length();
    
    if(strLenA<strLenB)
       result += a + b.substring(strLenB - strLenA);
    else if(strLenA>strLenB)
       result += a.substring(strLenA - strLenB) + b;
    else 
       result += a + b;
    
    return result;
}
