public String atFirst(String str) 
{
    int strLen = str.length();
    String result = "";
    
    switch (strLen) {
        case 0:
          result = "@@";
          break;
        case 1:
          result = str + "@";
          break;
        case 2:
          result = str;
          break;
        default:
          result = str.substring(0,2);
          break;
    }
    
    return result;
}
