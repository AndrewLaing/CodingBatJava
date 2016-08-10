public int[] front11(int[] a, int[] b) 
{
    int arrLenA = a.length;
    int arrLenB = b.length;
    int[] result;
    
    if(arrLenA>0) {
        if(arrLenB>0) {
            result = new int[2];
            result[0] = a[0];
            result[1] = b[0];
        }
        else {
            result = new int[1];
            result[0] = a[0];
        }
    }
    else if(arrLenB>0) {
        result = new int[1];
        result[0] = b[0];
    }
    else result = new int[0];
    return result;
}
