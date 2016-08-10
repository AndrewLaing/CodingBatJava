public boolean has271(int[] nums)
{
    int arrLen = nums.length;

    int target = 0;
    int matches = 0;
    
    for(int i=0; i<arrLen; i++) 
    {
        if(matches==0) {
            target=nums[i]+5;
            matches=1;
        }
        else if(matches==1){
            if(nums[i]==target) {
                target-=6;
                matches=2;
            }
            else {
                matches=1;
                target=nums[i]+5;
            }
        }
        else {
            if(nums[i]<target+3 && nums[i]>target-3 ) {
                return true;
            }
            else {
                matches=1;
                target=nums[i]+5;
            }
        }
    }
    return false;
    
}
