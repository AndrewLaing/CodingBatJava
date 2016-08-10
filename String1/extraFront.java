public String extraFront(String str) {
    int strLen = str.length();
    String front = "";
    String result = "";
    
    if(strLen<=2) front=str;
    else front=str.substring(0,2);
    
    for(int i=0; i<3; i++)
        result+=front;
        
    return result;
}
