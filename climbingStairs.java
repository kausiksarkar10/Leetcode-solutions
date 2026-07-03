class ClimbingStairs {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;

        // Recursive call
        return climbStairs(n - 1) + climbStairs(n - 2) ;
    }
}

//memoization
class Memoization {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return helper(n, dp);
    }

    public int helper(int n, int[] dp) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);

        return dp[n];
    }
}

//Tabulation
class tabu {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return helper(n, dp);
    }

    public int helper(int n, int[] dp) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);

        return dp[n];
    }
}

//Optimized

class Optimized{
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }
}