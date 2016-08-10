int countXX(String str) {
    int strLen = str.length();
    int count = 0;
    
    if(strLen<2) return 0;
    else if (strLen==2) 
    {
      if(str.equals("xx")) return 1;
    }
    
    for(int i=0; i<strLen-1; i++) {
      if(str.substring(i,i+2).equals("xx"))
          count++;
    }
    
    return count;
}
