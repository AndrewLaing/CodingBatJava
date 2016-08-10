public int caughtSpeeding(int speed, boolean isBirthday) 
{
    int birthdayBonus = 0;
    if(isBirthday) birthdayBonus += 5;
    
    if(speed < 61+birthdayBonus) return 0;
    else if(speed < 81+birthdayBonus) return 1;
    return 2;
}
