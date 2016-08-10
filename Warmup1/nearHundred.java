public boolean nearHundred(int n)
{
  int nearness1 = Math.abs(100-n);
  int nearness2 = Math.abs(200-n);
  
  if((nearness1<=10) || (nearness2<=10)) return true;
  return false;
}
