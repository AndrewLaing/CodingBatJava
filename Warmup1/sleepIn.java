public boolean sleepIn(boolean weekday, boolean vacation) 
{
  if(vacation) {
    return true;
  }
  if(!weekday) {
    return true;
  }
  return false;
}
