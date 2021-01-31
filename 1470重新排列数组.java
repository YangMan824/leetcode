class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length == 2) return nums;
        int[]num=new int[2*n];
        int j=0;
        for (int i = 0; i < n; i++) {
            num[j]=nums[i];
            num[++j]=nums[i+n];
            j++;
        }
        return num;
    }
}
