public int stringMatch(String a, String b) {
  
     int strLen;
     int count = 0;

     if(a.length() < b.length())
         strLen = a.length();
     else strLen = b.length();
     
     
     if(strLen<2) return count;
     else if(strLen==2) {
       if(a.substring(0,2).equals(b.substring(0,2))) return 1;
     }
     
     for(int i=0; i<strLen-1; i++) {
       if( a.substring(i,i+2).equals( b.substring(i,i+2) ) )
           count++;
     }
     
     return count;
}
