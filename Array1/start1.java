public int start1(int[] a, int[] b) {
     int result = 0;

     if(a.length>0) {
       if(a[0]==1) result ++;
     }
     
     if(b.length>0) {
       if(b[0]==1) result ++;
     }
     
     return result;
}
