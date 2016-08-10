public boolean mixStart(String str) 
{
  if(str.length()<3) return false;
  String test = str.substring(1,3);

  if(test.equals("ix")) return true;
  return false;
}
