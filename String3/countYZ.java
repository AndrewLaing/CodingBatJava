public int countYZ(String str) 
{
    int strLen = str.length();
    int count=0;
    str = str.toLowerCase();
    
    if(strLen==0) return count;
    else if(str.endsWith("y") || str.endsWith("z"))
        count++;

    if(strLen==1) return count;

    for(int i=1; i<strLen; i++) {
        if( !Character.isLetter(str.charAt(i)) ) {
            if(str.charAt((i-1))=='y' || str.charAt((i-1))=='z')
                count++;
        }
    }
    
    return count;
}
