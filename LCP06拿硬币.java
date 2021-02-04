class Solution {
    public int minCount(int[] coins) {
        int num=0;
    	for (int i = 0; i < coins.length; i++) {
			num+=coins[i]/2+coins[i]%2;
		}
    	return num;
    }
}