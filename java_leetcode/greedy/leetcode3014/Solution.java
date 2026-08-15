package java_leetcode.greedy.leetcode3014;
class Solution {
    public int minimumPushes(String word) {
        int feeByButton[][] = {
            {8, 1},
            {8, 2},
            {8, 3},
            {2, 4}
        };
        int result = 0, length = word.length();
        // for(int i = 0; i < fee.length || length <= 0; i++){
        //     int amount = length % fee[i][0];
        //     length /= 8;
        //     result += amount * fee[i][1];
        // }

        for(int i = 0; i < feeByButton.length; i++){
            if(length <= 0){
                return result;
            }
            int fee = feeByButton[i][1];
            int button = feeByButton[i][0];

            result += Math.min(button, length) * fee;
            length -= button;

        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumPushes("xycdefghij"));
    }
}
// a-z
/*
8 character first -> x1
8 next -> x2
8 next -> x3
2 next -> x4
*/
