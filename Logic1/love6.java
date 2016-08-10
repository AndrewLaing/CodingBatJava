public boolean love6(int a, int b) {
     int sumOfAB = a+b;
     int diffOfAB = Math.abs(a-b);
     
     return (a==6 || b==6 || sumOfAB==6 || diffOfAB==6);
}
