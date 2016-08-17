public boolean no14(int[] nums) {
    boolean hasOnes=false, hasFours=false;
    
    for(int i : nums) {
      if(i==1) hasOnes=true;
      else if(i==4) hasFours=true;
    }
    
    return (hasOnes==false || hasFours==false);
}
