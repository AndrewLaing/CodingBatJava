public int luckySum(int a, int b, int c) 
{
    int sum=0, unlucky=13;
    
    if(a==unlucky) return sum;
    sum+=a;
    if(b==unlucky) return sum;
    sum+=b;
    if(c==unlucky) return sum;
    sum+=c;
    
    return sum;
}
