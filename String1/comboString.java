public String comboString(String a, String b) {
    int strLenA = a.length();
    int strLenB = b.length();
    String result = "";
    
    if(strLenB < strLenA)
        result += b + a + b;
    else result += a + b + a;
    
    return result;
}
