public int blueTicket(int a, int b, int c) 
{
   int ab=a+b;
   int bc=b+c;
   int ac=a+c;
   
   if(ab==10 || ac==10 || bc==10) return 10;
   else if(ab==bc+10 || ab==ac+10) return 5;
   return 0;
}
