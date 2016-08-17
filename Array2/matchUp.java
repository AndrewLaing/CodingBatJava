public int matchUp(int[] nums1, int[] nums2) {
    int arrLen = nums1.length;
    int count = 0, diff;
    
    for(int i=0; i<arrLen; i++) {
        diff = Math.abs(nums1[i]-nums2[i]);
        if(diff==2 || diff==1) count++;
    }
    
    return count;
}
