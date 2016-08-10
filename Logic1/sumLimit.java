public int sumLimit(int a, int b) 
{
    int lenA = Integer.toString(a).length();
    int lenB = Integer.toString(a+b).length();

    if(lenA!=lenB) return a;
    return a+b;
}
