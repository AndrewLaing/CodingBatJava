public boolean specialEleven(int n) {
     if(n<11 && n>1) return false;
     return(n%11==0 || n%11==1);
}
