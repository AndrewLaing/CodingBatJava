public int blackjack(int a, int b) {
    if(a>21) {
        if(b>21)
            return 0;
        return b;
    }
    if(b>21) return a;
    return (a > b) ? a : b;
}
