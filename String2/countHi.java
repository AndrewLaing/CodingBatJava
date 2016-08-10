public int countHi(String str) {
    int strLen = str.length();
    int count=0;
    
    if(strLen<2) return count;
    
    for(int i=0; i<strLen-1; i++) {
      if(str.charAt(i)=='h' && str.charAt(i+1)=='i')
          count++;
    }
    
    return count;
}
