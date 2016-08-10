public boolean lastDigit(int a, int b, int c) {
    int modA = a%10;
    int modB = b%10;
    int modC = c%10;
    
    return (modA==modB || modA==modC || modB==modC);
}
