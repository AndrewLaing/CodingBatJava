public int dateFashion(int you, int date) 
{
    if(you<3 || date<3) return 0;
    else if(you>7 || date>7) return 2;
    return 1;
}
