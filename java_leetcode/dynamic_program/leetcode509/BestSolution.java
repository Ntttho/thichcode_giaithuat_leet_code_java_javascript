package java_leetcode.dynamic_program.leetcode509;

public class BestSolution {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int f0 = 0; int f1 = 1, result = 0;
        for(int i = 1; i < n; i++){
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }


        return result;
    }

}
