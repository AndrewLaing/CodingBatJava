public String getSandwich(String str) {
    String bread = "bread";
    String result = "";
    int strLen = str.length();
    int firstSlice = str.indexOf(bread);
    int lastSlice = str.lastIndexOf(bread);
    
    if(strLen<11 || firstSlice==-1) return result;
  
    if(lastSlice<firstSlice+6) return result;
    
    result = str.substring(firstSlice+5,lastSlice);
    
    return result;
}
