public boolean array123(int[] nums) {
     boolean one = false;
     boolean two = false;
     boolean three = false;
     
     int arrLen = nums.length;
     int temp=0;
     
     if(arrLen < 3) return false;
     
     for(int i = 0; i < arrLen; i++) {
         temp = nums[i];
         if(temp==1) one=true;
         else if(temp==2) two=true;
         else if(temp==3) three=true;
     }
     
     return (one && two && three);
     
}
