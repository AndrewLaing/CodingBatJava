public boolean equalIsNot(String str) 
{
    int strLessIs  = str.replace("is", "").length();
    int strLessNot = str.replace("not"," ").length();
    
    return strLessIs==strLessNot;
}
  
