public boolean stringE(String str) {
  int strLen = str.length();
  int eTotal = 0;
  
  for(int i=0; i<strLen; i++) {
    if(str.charAt(i)=='e')
        eTotal++;
  }
  
  if(eTotal>=1 && eTotal<=3) return true;
  return false;
}
