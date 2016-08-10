public boolean commonEnd(int[] a, int[] b) {
    int arrLenA = a.length;
    int arrLenB = b.length;
    
    if(a[0]==b[0]) return true;
    return (a[arrLenA-1] == b[arrLenB-1]);
}
