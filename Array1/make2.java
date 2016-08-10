public int[] make2(int[] a, int[] b) 
{
    int arrLen = a.length;
    int[] result = new int[2];
    int count=0;

    if(arrLen>0) {
        for(int i=0; i<arrLen; i++) {
            result[count]=a[i];
            count++;
            if(count>=2) return result;
        }
    }

    for(int i=count, j=0; i<2; i++, j++) {
        result[count]=b[j];
        count++;
        if(count>=2) return result;
    }
    
    return result;
}
