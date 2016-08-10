public String starOut(String str) 
{
     int strLen = str.length();
     int starPos = str.indexOf("*");
     String result = "";

     if(strLen<1 || starPos==-1) return str;
     else if(strLen<3) return "";
     else if(strLen==3 && starPos==1) return "";
     
     boolean deleteThis = false;
     
     for(int i=0; i<strLen; i++) 
     {
       deleteThis=false;
       if(str.charAt(i)=='*') deleteThis=true;
       else if(i<strLen-1) {
         if(str.charAt(i+1)=='*') deleteThis=true;
         else if(i>0) {
           if(str.charAt(i-1)=='*') deleteThis=true;
         }
       }
       if(!deleteThis) result += str.charAt(i);
     }
     
     return result;
}
