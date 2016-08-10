public boolean squirrelPlay(int temp, boolean isSummer) {
    int upperLimit = 90;
    if(isSummer) upperLimit += 10;
    return (temp>=60 && temp<=upperLimit);
}
