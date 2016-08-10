public String frontTimes(String str, int n)
{
  int strLen = str.length();
  String result = "";

  if(strLen<=3) {
    for(int i=0; i<n; i++)
        result+=str;
  }
  else {
    String front = str.substring(0,3);
    for(int i=0; i<n; i++)
        result+=front;
  }

  return result;
}
