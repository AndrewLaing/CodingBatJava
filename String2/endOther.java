public boolean endOther(String a, String b) {
  int strLenA = a.length();
  int strLenB = b.length();
  String lowA=a.toLowerCase(), lowB=b.toLowerCase();
  
  if(strLenA==0 || strLenB==0) return true;
  if(lowA.equals(lowB)) return true;
  
  if(strLenA<strLenB)
      return (lowA.equals(lowB.substring(strLenB-strLenA)));
  else
      return (lowB.equals(lowA.substring(strLenA-strLenB)));
}
