public int[] fizzArray3(int start, int end) {
    int[] result = new int[end-start];
    
    for(int i=start, j=0; i<end; i++, j++)
        result[j]+=i;
        
    return result;
}
