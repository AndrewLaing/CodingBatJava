public String fizzString2(int n) {
    String result = "";
    
    if(n%3==0) result+="Fizz";
    if(n%5==0) result+="Buzz";
    
    if(result.equals("")) result += Integer.toString(n);
    result += "!";
    return result;
}
