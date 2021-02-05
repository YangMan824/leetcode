class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,num=1;
    	while(n>0) {
    		num*=n%10;
    		sum+=n%10;
    		n/=10;
    	}
    	return num-sum;
    }
}