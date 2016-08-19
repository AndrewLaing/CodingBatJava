public int countTriple(String str) 
{
    int strLen = str.length();
    int sameCount=1, total=0;
    if(strLen<3) return total;
    
    char prev = str.charAt(0);
    
    for(int i=1; i<strLen; i++) {
        if(str.charAt(i)==prev) {
            sameCount++;
            if(sameCount>2)
                total++;
        }
        else sameCount=1;
        prev = str.charAt(i);
    }
    
    return total;
}
