boolean doubleX(String str) {
  int count = 0; 
  int allX = 0;
  boolean flagDouble = false;
  int strLen = str.length();
  
  if(strLen<=1) return flagDouble;
  
  for(int i=0; i<strLen; i++) 
  {
     if( str.charAt(i) == 'x' ) {
         allX++;
         count++;
         if( count == 2 && allX==2)
             flagDouble = true;
     }
     else count = 0;
  }
  
  return flagDouble;
}
