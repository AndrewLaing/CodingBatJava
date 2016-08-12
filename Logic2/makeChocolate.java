public int makeChocolate(int small, int big, int goal) {
    int temp;
    
    for(int i=0; i<big; i++) {
        temp=goal-5;
        if(temp==0) return 0;
        else if(temp>0)
          goal-=5;
    }
    
    if(goal>small) return -1;
    return goal;
}
