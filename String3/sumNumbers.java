public int sumNumbers(String str)
{
    int strLen = str.length();
    int total = 0;
    String digitStr = "0";
    char temp;
    
    if(strLen==0) return total;
    
    for(int i=0; i<strLen; i++) {
        temp = str.charAt(i);
        if( Character.isDigit(temp) )
            digitStr+=temp;
        else {
            total += Integer.parseInt(digitStr);
            digitStr = "0";
        }
    }
    
    total += Integer.parseInt(digitStr);
    return total;
}
