public String[] fizzBuzz(int start, int end) {
    String[] result = new String[end-start];
  
    for(int i=start, j=0; i<end; i++, j++) {
        if(i%3==0) {
            if(i%5==0)
                result[j]="FizzBuzz";
            else
                result[j]="Fizz";
        }
        else if(i%5==0)
            result[j]="Buzz";
        else
            result[j] = String.valueOf(i);
    }
    
    return result;
}
