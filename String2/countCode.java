public int countCode(String str) 
{
    int strLen = str.length();
    int count = 0;

    for(int i=0; i<strLen-3; i++) {
        if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e')
            count++;
    }
    return count;
}
