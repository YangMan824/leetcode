class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int num=0;
    	String str="";
    	for (int i = 0; i < words.length; i++) {
    		str=words[i];
			for (int j = 0; j < allowed.length(); j++) {
				str=str.replace(allowed.substring(j,j+1), "");
			}
			if(str.length()==0)num++;
		}
    	return num;
    }
}