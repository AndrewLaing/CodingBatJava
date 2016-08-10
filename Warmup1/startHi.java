public boolean startHi(String str) 
{
  if(str.length()<2) return false;
  
  String test = str.substring(0,2);
  
  if(test.equals("hi")) return true;
  return false;
}
