public boolean modThree(int[] nums) 
{
    int count=0, last=99;
    
    for(int i : nums) {
        if(i%2==0) {
          if(last==0) count++;
          else count=1;
          last=0;
        }
        else {
          if(last==1) count++;
          else count=1;
          last=1;
        }
        if(count==3) return true;
    }
    
    return false;
}
