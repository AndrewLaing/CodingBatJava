public String withoutEnd(String str) {
    int strLen = str.length();
    String result = "";
    
    if(strLen>=3) 
        result+=str.substring(1,strLen-1);
    
    return result;
}
