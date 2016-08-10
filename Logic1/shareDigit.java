public boolean shareDigit(int a, int b) 
{
    return (b%10==a/10 || a%10 ==b/10 || a%10==b%10 || a/10==b/10);
}
