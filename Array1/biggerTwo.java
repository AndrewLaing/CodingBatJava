public int[] biggerTwo(int[] a, int[] b)
{
    int sumA = 0;
    int sumB = 0;
    
    for(int i=0; i<2; i++) {
        sumA += a[i];
        sumB += b[i];
    }

    if(sumB>sumA) return b;
    return a;
}
