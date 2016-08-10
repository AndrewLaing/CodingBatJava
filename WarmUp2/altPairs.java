public String altPairs(String str) 
{
    int strLen = str.length();
    if(strLen<=2) return str;
    
    String result = "";
    int count=0;
    boolean print = true;
    
    for(int i = 0; i < strLen; i++) {
        count++;
        if(count>2) {
          count=1;
          if(print) print=false;
          else print=true;
        }
        if(print) result += str.charAt(i);
    }
    return result;
}
