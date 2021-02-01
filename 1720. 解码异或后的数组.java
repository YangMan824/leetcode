class Solution {
    public int[] decode(int[] encoded, int first) {
        int[]arr=new int[encoded.length+1];
    	arr[0]=first;
    	//异或的本质就是异或的逆运算，a^b=c,a^c=b
    	for (int i = 1; i < arr.length; i++) {
			arr[i]=arr[i-1] ^ encoded[i-1];
		}
    	return arr;
    }
}