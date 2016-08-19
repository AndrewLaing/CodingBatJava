public int maxBlock(String str) 
{
    int strLen = str.length();
    int max = 1, count = 1;
    
    if(strLen==0) return 0;
    else if(strLen==1) return count;
  
    char prev = str.charAt(0);
    
    for(int i=1; i<strLen; i++) {
        if(str.charAt(i)==prev) {
            count++;
            if(count>max) max=count;
        }
        else count=1;
        prev = str.charAt(i);
    }
    
    return max;
}
