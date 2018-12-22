class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        for (int count = 0; count < S.length(); count++) {
            if (J.contains(String.valueOf(S.charAt(count)))) {
                sum++;
            }
        }
        return sum;
    }
}
