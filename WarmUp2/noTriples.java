public boolean noTriples(int[] nums) {
   boolean triple = true;
   int count = 1;
   int arrLen = nums.length;
   
   if(arrLen<=2) return triple;
   
   int prev = nums[0];

   for(int i=1; i<arrLen; i++) {
     if(nums[i]==prev) count++;
     else count=1;
     if(count==3) triple=false;
     prev = nums[i];
   }
   return triple;
}
