public int greenTicket(int a, int b, int c) 
{
    int result=0;
    if(a==b || a==c) result+=10;
    if(b==c) result+=10;
    return result;
}
