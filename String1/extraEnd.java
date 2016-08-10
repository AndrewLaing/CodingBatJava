public String extraEnd(String str) {
     int strLen = str.length();
     String result = "";
     String end = str.substring(strLen-2);
     
     for(int i=0; i<3; i++)
         result += end;
    
     return result;
}
