public int maxTriple(int[] nums) 
{
   int arrLen = nums.length;
   int max=nums[0];
   
   if(arrLen==1) return max;
   
   if(nums[arrLen/2]>max) max=nums[arrLen/2];
   if(nums[arrLen-1]>max) max=nums[arrLen-1];
   
   return max;
}
