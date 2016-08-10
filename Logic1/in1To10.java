public boolean in1To10(int n, boolean outsideMode) {
    if(outsideMode==false)
        return (n>0 && n<11);
    else return (n<=1 || n>=10);
}
