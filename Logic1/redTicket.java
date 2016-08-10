public int redTicket(int a, int b, int c) 
{
     if(a==2 && b==a && c==a) return 10;
     else if(a==c && b==a && c==a) return 5;
     else if(a!=b && a!=c) return 1;
     return 0;
}
