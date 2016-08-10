public int close10(int a, int b) 
{
  int aCloseness = Math.abs(10-a);
  int bCloseness = Math.abs(10-b);
  
  if(aCloseness<bCloseness) return a;
  else if (bCloseness<aCloseness) return b;
  else return 0;
}
