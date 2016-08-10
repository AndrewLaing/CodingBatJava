public int array667(int[] nums) {
     int arrLen = nums.length;
     if(arrLen<2) return 0;
     
     int count = 0;
     int prev = nums[0];
     
     for(int i=1; i<arrLen; i++) {
         if( (prev==6) && (nums[i]==6 || nums[i]==7) )
            count++;
         prev=nums[i];
     }
     
     return count;
}
