public int last2(String str) 
{
  int strLen = str.length();
  int count = 0;
  
  if( strLen < 3 ) return count;
  
  String endTwo = str.substring( strLen - 2 );

  for(int i=0; i < strLen-2; i++)
  {
      if( str.substring( i, i+2 ).equals( endTwo ) )
          count++;

  }
  return count;
}
