class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        while(m > 0 && n > 0) {
            if(nums1[m - 1] > nums2[n - 1]) nums1[m + n - 1] = nums1[m-- - 1];
            else nums1[m + n - 1] = nums2[n-- - 1];
        }
        while(n > 0) nums1[m + n - 1] = nums2[n-- - 1];
        
    }
}
/  [1,2,2,3,5,6]
