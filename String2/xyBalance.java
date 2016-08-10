public boolean xyBalance(String str)
{
    if(str.indexOf("y")<str.indexOf("x")) {
        if(str.lastIndexOf("y")<str.lastIndexOf("x")) 
            return false;
    }
    
    if(str.lastIndexOf("y")<str.lastIndexOf("x")) 
        return false;

    return true;
}
