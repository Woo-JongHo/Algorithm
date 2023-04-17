class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for(int n = i; n <= j; n++) {
            String str = Integer.toString(n);
        
            for(int m = 0; m < str.length(); m++) {
                if(str.charAt(m) == Integer.toString(k).charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
