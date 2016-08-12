public boolean closeFar(int a, int b, int c) {
    if(Math.abs(b-a)<=1 && Math.abs(c-a)>1 && Math.abs(c-b)>1 ) 
      return true;
    if(Math.abs(c-a)<=1 && Math.abs(b-a)>1 && Math.abs(b-c)>1)
      return true;
    return false;
}
