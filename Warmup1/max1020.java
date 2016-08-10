public int max1020(int a, int b) {
  boolean aFits = (a>9 && a<21);
  boolean bFits = (b>9 && b<21);
  
  if(aFits) {
    if(bFits) {
      if(a>b) return a;
      else return b;
    }
    return a;
  }
  else if(bFits) return b;
  return 0;
}
